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
		String nome = resourceRequest.getParameter("nome");
		String texto = resourceRequest.getParameter("texto");
		String time = resourceRequest.getParameter("time");
		String sexo = resourceRequest.getParameter("sexo");
		String senha = resourceRequest.getParameter("senha");
		String liferay = resourceRequest.getParameter("liferay");
		String java = resourceRequest.getParameter("java");
		org.json.JSONObject jsonObject = new JSONObject();
		jsonObject.put("nome", nome);
		jsonObject.put("texto", texto);
		jsonObject.put("time", time);
		jsonObject.put("sexo", sexo);
		jsonObject.put("senha", senha);
		jsonObject.put("liferay", liferay);
		jsonObject.put("java", java);
		resourceResponse.setContentType("application/json");
		PrintWriter out = resourceResponse.getWriter();
		out.print(jsonObject);
		out.flush();
	}

}