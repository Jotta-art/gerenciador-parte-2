<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Java Standard Taglib</title>
</head>
<body>

 usuário Logado: ${usuarioLogado.login}

<c:if test="${not empty empresa}">
    Empresa ${ empresa } cadastrada com sucesso!
</c:if>

<br/>

Lista de empresas <br/>
<ul>
    <c:forEach items="${empresas}" var="empresa">
        <li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
            <a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">edita</a>
            <a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">remove</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
