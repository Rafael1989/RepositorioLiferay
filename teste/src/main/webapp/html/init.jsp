<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="javax.portlet.ActionRequest"%>
<%@ page import="javax.portlet.PortletPreferences"%>

<portlet:defineObjects />
<theme:defineObjects/> 

<portlet:actionURL name="imprimir" var="imprimirURL"></portlet:actionURL>
<portlet:resourceURL var="imprimirAjaxUrl"></portlet:resourceURL>

<script>

function imprimir(){
	var nome = $('#nome').val();
	$.ajax({
		url: '${imprimirAjaxUrl}',
		data: {'<portlet:namespace/>nome':nome},
		type:'post',
		dataType: 'json',
		success: function(data){
			$('#nombre').html(data['nome']);
		}
	});
}

</script>


