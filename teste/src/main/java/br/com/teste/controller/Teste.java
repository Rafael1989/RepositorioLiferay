package br.com.teste.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.JSONObject;

import com.liferay.portal.kernel.servlet.SessionMessages;
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
		SessionMessages.add(actionRequest, "");
		actionRequest.setAttribute("nome", nome);
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String nome = resourceRequest.getParameter("nome");
		org.json.JSONObject jsonObject = new JSONObject();
		jsonObject.put("nome", nome);
		resourceResponse.setContentType("application/json");
		PrintWriter out = resourceResponse.getWriter();
		out.print(jsonObject);
		out.flush();
	}

}