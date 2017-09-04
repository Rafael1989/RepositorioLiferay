package br.com.teste.configuration;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;

public class TesteConfiguration extends DefaultConfigurationAction{
	
	@Override
	public void processAction(PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		String texto = actionRequest.getParameter("texto");
		PortletPreferences prefs = actionRequest.getPreferences();
		prefs.setValue("texto", texto);
		prefs.store();
		actionRequest.setAttribute("mensagemSucesso", "Salvo com sucesso");
	}
	
	@Override
	public String render(PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {
		return "/html/configuration.jsp";
	}

}
