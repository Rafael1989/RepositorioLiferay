package br.com.teste.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.gndi.liferay.model.Contrato;
import br.com.gndi.liferay.model.ContratoClp;
import br.com.gndi.liferay.service.ContratoLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.dynamicdatalists.model.DDLRecord;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalServiceUtil;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.model.JournalArticleDisplay;
import com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.portlet.journalcontent.util.JournalContentUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class Teste extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		renderRequest.setAttribute("pergunta", "Qual o seu nombre?");
		super.doView(renderRequest, renderResponse);
	}


	@ProcessAction(name = "imprimir")
	public void imprimir(ActionRequest actionRequest, ActionResponse actionResponse) {
		String nome = actionRequest.getParameter("nome");
		String liferay = actionRequest.getParameter("liferay");
		String java = actionRequest.getParameter("java");
		String senha = actionRequest.getParameter("senha");
		String sexo = actionRequest.getParameter("sexo");
		String time = actionRequest.getParameter("time");
		String texto = actionRequest.getParameter("texto");
		SessionMessages.add(actionRequest, "");
		actionRequest.setAttribute("nome", nome);
		actionRequest.setAttribute("liferay", liferay);
		actionRequest.setAttribute("java", java);
		actionRequest.setAttribute("senha", senha);
		actionRequest.setAttribute("sexo", sexo);
		actionRequest.setAttribute("time", time);
		actionRequest.setAttribute("texto", texto);
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		//PREFERENCE
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
			//SERVICE BUILDER
			ContratoClp contratoClp = new ContratoClp();
			contratoClp.setNomeContrato("testeTrintaUm");
			contratoClp.setContratoId(1L);
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Contrato.class.getName(),resourceRequest);
			ContratoLocalServiceUtil.adicionaContratoEmpresa(contratoClp, serviceContext);
			ContratoLocalServiceUtil.removeContratoEmpresa(contratoClp, serviceContext);
			List<Contrato> contratos = ContratoLocalServiceUtil.buscaPorContrato("testeTrintaUm");
			contratoClp.setNomeContrato("teste2");
			ContratoLocalServiceUtil.updateContrato(contratoClp);
			List<Contrato> contratosModificados = ContratoLocalServiceUtil.buscaPorContrato("teste2");
			//WEB CONTENT
			ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			JournalArticle journalArticle = JournalArticleLocalServiceUtil.getArticleByUrlTitle(themeDisplay.getScopeGroupId(),"teste");
			String articleId = journalArticle.getArticleId();
			JournalArticleDisplay journalArticleDisplay = JournalContentUtil.getDisplay(themeDisplay.getScopeGroupId(), articleId, "", "", themeDisplay);
			String webContent = journalArticleDisplay.getContent();
			//LISTA DINAMICA
			List<DDLRecord> records = DDLRecordLocalServiceUtil.getRecords(Long.parseLong(conf));
			for(DDLRecord ddlRecord:records){
				org.json.JSONObject jsonObject = new JSONObject();
				jsonObject.put("nome", nome);
				jsonObject.put("texto", texto);
				jsonObject.put("time", time);
				jsonObject.put("sexo", sexo);
				jsonObject.put("senha", senha);
				jsonObject.put("liferay", liferay);
				jsonObject.put("java", java);
				jsonObject.put("conf", conf);
				jsonObject.put("contrato", (!contratos.isEmpty())?contratos.get(0).getNomeContrato():"");
				jsonObject.put("contratoModificado", contratosModificados.get(0).getNomeContrato());
				descricao = String.valueOf(ddlRecord.getField("descricao").getValue());
				jsonObject.put("descricao", descricao);
				jsonObject.put("webcontent",webContent);
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

}