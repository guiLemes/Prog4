<%-- 
    Document   : game-lista
    Created on : 14/08/2015, 21:00:59
    Author     : guilherme.lemes
--%>
<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="br.pucpr.prog4.steamo.models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:forEach var="produto"
                   items="${produtos}">
            <div>
                <p>${produto.nome}
                    <a href="produto-detalhe?id="${produto.cod}>
                        <img src="../Imagens/${produto.nome}.jpg">
                    </a>
                <p>R$ ${produto.preço}</p>
            </div>
        </c:forEach>
        </body>
</html>
