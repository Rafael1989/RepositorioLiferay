package br.com.teste.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.gndi.liferay.model.Contrato;
import br.com.gndi.liferay.model.ContratoClp;
import br.com.gndi.liferay.service.ContratoLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.dynamicdatalists.model.DDLRecord;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalServiceUtil;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.model.JournalArticleDisplay;
import com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.portlet.journalcontent.util.JournalContentUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class Teste extends MVCPortlet {

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		renderRequest.setAttribute("pergunta", "Qual o seu nombre?");
		super.doView(renderRequest, renderResponse);
	}

	@ProcessAction(name = "imprimir")
	public void imprimir(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		enviaEmail();
		String nome = actionRequest.getParameter("nome");
		String liferay = actionRequest.getParameter("liferay");
		String java = actionRequest.getParameter("java");
		String senha = actionRequest.getParameter("senha");
		String sexo = actionRequest.getParameter("sexo");
		String time = actionRequest.getParameter("time");
		String texto = actionRequest.getParameter("texto");
		SessionMessages.add(actionRequest, "");
		Teste teste = new Teste();
		teste.setDescricao("teste da descricao");
		// JASPER
		byte[] bytes = montaPDF(actionRequest, "teste.jasper", teste);
		HttpServletRequest request = PortalUtil
				.getHttpServletRequest(actionRequest);
		HttpServletResponse response = PortalUtil
				.getHttpServletResponse(actionResponse);
		try {
			ServletResponseUtil.sendFile(request, response, "teste.pdf", bytes,
					"application/download");
		} catch (IOException e) {
			e.printStackTrace();
		}
		actionRequest.setAttribute("nome", nome);
		actionRequest.setAttribute("liferay", liferay);
		actionRequest.setAttribute("java", java);
		actionRequest.setAttribute("senha", senha);
		actionRequest.setAttribute("sexo", sexo);
		actionRequest.setAttribute("time", time);
		actionRequest.setAttribute("texto", texto);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		// PREFERENCE
		PortletPreferences prefs = resourceRequest.getPreferences();
		String conf = prefs.getValue("texto", "");
		String descricao = null;
		JSONArray jsonArray = new JSONArray();
		String nome = resourceRequest.getParameter("nome");
		String texto = resourceRequest.getParameter("texto");
		String time = resourceRequest.getParameter("time");
		String sexo = resourceRequest.getParameter("sexo");
		String senha = resourceRequest.getParameter("senha");
		String liferay = resourceRequest.getParameter("liferay");
		String java = resourceRequest.getParameter("java");

		try {
			// SERVICE BUILDER
			ContratoClp contratoClp = new ContratoClp();
			contratoClp.setNomeContrato("testeTrintaUm");
			contratoClp.setContratoId(1L);
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					Contrato.class.getName(), resourceRequest);
			ContratoLocalServiceUtil.adicionaContratoEmpresa(contratoClp,
					serviceContext);
			ContratoLocalServiceUtil.removeContratoEmpresa(contratoClp,
					serviceContext);
			List<Contrato> contratos = ContratoLocalServiceUtil
					.buscaPorContrato("testeTrintaUm");
			contratoClp.setNomeContrato("teste2");
			ContratoLocalServiceUtil.updateContrato(contratoClp);
			List<Contrato> contratosModificados = ContratoLocalServiceUtil
					.buscaPorContrato("teste2");
			// WEB CONTENT
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest
					.getAttribute(WebKeys.THEME_DISPLAY);
			JournalArticle journalArticle = JournalArticleLocalServiceUtil
					.getArticleByUrlTitle(themeDisplay.getScopeGroupId(),
							"teste");
			String articleId = journalArticle.getArticleId();
			JournalArticleDisplay journalArticleDisplay = JournalContentUtil
					.getDisplay(themeDisplay.getScopeGroupId(), articleId, "",
							"", themeDisplay);
			String webContent = journalArticleDisplay.getContent();
			// LISTA DINAMICA
			List<DDLRecord> records = DDLRecordLocalServiceUtil.getRecords(Long
					.parseLong(conf));
			for (DDLRecord ddlRecord : records) {
				org.json.JSONObject jsonObject = new JSONObject();
				jsonObject.put("nome", nome);
				jsonObject.put("texto", texto);
				jsonObject.put("time", time);
				jsonObject.put("sexo", sexo);
				jsonObject.put("senha", senha);
				jsonObject.put("liferay", liferay);
				jsonObject.put("java", java);
				jsonObject.put("conf", conf);
				jsonObject.put("contrato", (!contratos.isEmpty()) ? contratos
						.get(0).getNomeContrato() : "");
				jsonObject.put("contratoModificado", contratosModificados
						.get(0).getNomeContrato());
				descricao = String.valueOf(ddlRecord.getField("descricao")
						.getValue());
				jsonObject.put("descricao", descricao);
				jsonObject.put("webcontent", webContent);
				jsonArray.put(jsonObject);
			}
		} catch (NumberFormatException | SystemException | PortalException e) {
			e.printStackTrace();
		}

		resourceResponse.setContentType("application/json");
		PrintWriter out = resourceResponse.getWriter();
		out.print(jsonArray);
		out.flush();
	}

	// JASPER
	private byte[] montaPDF(ActionRequest actionRequest, String filename,
			Teste teste) {
		HttpServletRequest request = PortalUtil
				.getHttpServletRequest(actionRequest);
		String reportPath = request.getSession().getServletContext()
				.getRealPath(File.separator);
		String pathIMG = reportPath + "img" + File.separator;
		String fileNameReport = "jasper" + File.separator + filename;

		ByteArrayOutputStream reportArrayOutputStream = new ByteArrayOutputStream();
		Map<String, Object> param = new HashMap<String, Object>();
		byte[] report = null;

		param.put("P_DESCRICAO", teste.getDescricao());
		param.put("REPORT_PATH", reportPath + "jrxml");
		param.put("SEPARATOR", File.separator);
		param.put("IMAGE_PATH", pathIMG);

		try {
			// JasperReport reportCompiler =
			// JasperCompileManager.compileReport(reportPath + fileNameReport);

			JRDataSource datasource = new JRBeanCollectionDataSource(
					Arrays.asList(teste), true);
			JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath
					+ fileNameReport, param, datasource);

			if (jasperPrint.getPages().size() > 0) {
				// exporta para pdf
				JasperExportManager.exportReportToPdfStream(jasperPrint,
						reportArrayOutputStream);

				report = reportArrayOutputStream.toByteArray();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return report;
	}

	public void enviaEmail() {

		String destinatario = "seu_email@vcdigitaaqui.com.br";
		String remetente = "seu_email@vcdigitaaqui.com.br";

		//HOTMAIL
		Properties properties = System.getProperties();
		properties.put("mail.transport.protocol", "smtp");  
		properties.put("mail.smtp.host", "smtp.live.com");  
        properties.put("mail.smtp.socketFactory.port", "587");  
        properties.put("mail.smtp.socketFactory.fallback", "false");  
        properties.put("mail.smtp.starttls.enable", "true");  
        properties.put("mail.smtp.auth", "true");  
        properties.put("mail.smtp.port", "587"); 
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("seu_email@vcdigitaaqui.com.br","AquiP0d3D1g1T4R4S3NH4");
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(remetente));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
			message.setSubject("Assunto");

			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText("Mensagem do corpo do email");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			message.setContent(multipart);

			Transport.send(message);
			System.out.println("Email enviado com sucesso");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}

}