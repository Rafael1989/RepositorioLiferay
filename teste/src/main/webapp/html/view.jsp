<%@ include file="init.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body onload="limpa()">
<h3>Memória</h3>
<p>Essa é a minha memória, não repare a bagunça.</p>
<form name="fm" id="fm" action="<%= imprimirURL %>" enctype="multipart/form-data" method="post">
	File:<br/>
	<input name='<portlet:namespace/>file' type="file"/><br/>
	Textarea:<br/>
	<textarea name="<portlet:namespace/>texto" id="texto" rows="5" cols="5"></textarea><br/>
	Select: <br/>
	<select name="<portlet:namespace/>time" id="time">
		<option value="">Selecione um time
		<option value="Palmeiras">Palmeiras
		<option value="Corinthians">Corinthians
		<option value="São Paulo">São Paulo
	</select><br/>
	Radio:<br/>
	<input type="radio" name="<portlet:namespace/>sexo" id="masculino" value="Masculino">Masculino<br/>
	<input type="radio" name="<portlet:namespace/>sexo" id="feminino" value="Feminino">Feminino<br/>
	Password:<br/>
	<input type="password" id="senha" name="<portlet:namespace/>senha"><br/>
	Checkbox:<br/>
	<input type="checkbox" id="cbxLiferay" name="<portlet:namespace/>liferay" value="liferay">Liferay<br/>
	Checkbox com name igual:<br/>
	<input type="checkbox" name="<portlet:namespace/>java" id="javaME" value="javaME">JavaME<br/>
	ou<br/>
	<input type="checkbox" name="<portlet:namespace/>java" id="javaEE" value="javaEE">JavaEE<br/>
	Text:<br/>
	<input type="text" name="<portlet:namespace/>nome" id="nome" /><br/>
	Submit:<br/>
	<input type="submit" value="Imprimir"/>
	<!-- <input type="button" value="Imprimir" onclick="imprimir()"> --> 
</form>
${pergunta}
<p id="pnombre"></p>
<p id="ptexto"></p>
<p id="ptime"></p>
<p id="psexo"></p>
<p id="psenha"></p>
<p id="pliferay"></p>
<p id="pjava"></p>
<p id="pconf"></p>
<p id="pdescricao"></p>
<p id="pcontrato"></p>
<p id="pcontratoModificado"></p>
<p id="pwebcontent"></p>
<c:if test="${not empty nome}">
<p>Meu nome é ${nome}.</p>
</c:if>
<c:if test="${not empty liferay || not empty java}">
Eu conheço:<br/> 
</c:if>
<c:if test="${not empty liferay}">
	-${liferay}
</c:if><br/>
<c:if test="${not empty java}">
	-${java}
</c:if><br/>
<c:if test="${not empty senha}">
	Sua senha: ${senha}
</c:if><br/>
<c:if test="${not empty sexo}">
	Seu sexo é: ${sexo}
</c:if><br/>
<c:if test="${not empty time}">
	Meu time é o: ${time}
</c:if><br/>
<c:if test="${not empty texto }">
	${texto}
</c:if>
</body>
</html>