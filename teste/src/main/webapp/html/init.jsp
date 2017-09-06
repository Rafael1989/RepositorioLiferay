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
<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />
<portlet:resourceURL var="imprimirAjaxUrl"></portlet:resourceURL>

<script>
function limpa(){
	$('#nome').val('');
	$('#texto').val('');
	$('#time').val('');
	$('#senha').val('');
	$('#masculino').prop('checked',false);
	$('#feminino').prop('checked',false);
	$('#javaME').prop('checked',false);
	$('#javaEE').prop('checked',false);
	$('#cbxLiferay').prop('checked',false);
}

function imprimir(){
	var nome = $('#nome').val();
	if(nome == ''){
		alert('Favor informar o nome');
		return false;
	}
	var texto = $('#texto').val();
	if(texto == ''){
		alert("Favor informar o texto.");
		return false;
	}
	var time = $('#time').val();
	if(time == ''){
		alert("Favor informar o time");
		return false;
	}
	var senha = $('#senha').val();
	if(senha == ''){
		alert("Favor informar a senha.");
		return false;
	}
	var liferay;
	if($('#cbxLiferay').is(':checked')){
		liferay = $('#cbxLiferay').val();
	}else{
		alert("Favor informar se conhece liferay.");
		return false;
	}
	var sexo;
	if($('#masculino').is(':checked')){
		sexo = $('#masculino').val();
	}else if($('#feminino').is(':checked')){
		sexo = $('#feminino').val();
	}else{
		alert("Favor informar o sexo");
		return false;
	}
	var java;
	if(!$('#javaEE').is(':checked') && !$('#javaME').is(':checked')){
		alert("Favor informar se conhece o JavaEE ou o JavaME");
		return false;
	}
	if($('#javaEE').is(':checked')){
		java = $('#javaEE').val();
	}
	if($('#javaME').is(':checked')){
		java = $('#javaME').val();
	}
	$.ajax({
		url: '${imprimirAjaxUrl}',
		data: {'<portlet:namespace/>nome':nome,
				'<portlet:namespace/>texto':texto,
				'<portlet:namespace/>time':time,
				'<portlet:namespace/>sexo':sexo,
				'<portlet:namespace/>senha':senha,
				'<portlet:namespace/>liferay':liferay,
				'<portlet:namespace/>java':java
		},
		type:'post',
		dataType: 'json',
		success: function(data){
			for(i = 0;i<data.length;i++){
				$('#pnombre').append(' '+ data[i]['nome']);
				$('#ptexto').append(' '+ data[i]['texto']);
				$('#ptime').append(' '+ data[i]['time']);
				$('#psexo').append(' '+ data[i]['sexo']);
				$('#psenha').append(' '+ data[i]['senha']);
				$('#pliferay').append(' '+ data[i]['liferay']);
				$('#pjava').append(' '+ data[i]['java']);
				$('#pconf').append(' '+ data[i]['conf']);
				$('#pdescricao').append(' '+ data[i]['descricao']);	
				$('#pcontrato').append(' '+ data[i]['contrato']);
				$('#pcontratoModificado').append(' '+data[i]['contratoModificado']);
				$('#pwebcontent').append(' '+data[i]['webcontent']);
			}
		}
	});
}

</script>


