<%@ include file="init.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h3>Teste</h3>
<p>Isso é um teste.</p>
<form name="fm" id="fm" action="<%= imprimirURL %>" method="post">
	<input type="text" name="<portlet:namespace/>nome" id="nome" />
<!--<input type="submit" value="Imprimir"/>-->
	<input type="button" value="Imprimir" onclick="imprimir()">
</form>
${pergunta}
<p id="nombre"></p>
<c:if test="${not empty nome}">
<p>Meu nome é ${nome}.</p>
</c:if>
