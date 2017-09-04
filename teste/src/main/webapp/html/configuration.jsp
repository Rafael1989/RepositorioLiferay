<%@ include file="init.jsp" %>
<form action="${configurationURL}" method="post">
	<input type="text" name='<portlet:namespace/>texto'>
	<input type="submit"/>
</form>
${mensagemSucesso}