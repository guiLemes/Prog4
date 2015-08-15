<%-- 
    Document   : game-lista
    Created on : 14/08/2015, 21:00:59
    Author     : guilherme.lemes
--%>

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
        <h1>Hello World!</h1>
        <%
            List<Produto> produtos;
            produtos = (List<Produto>) request.getAttribute("produto");
            
            for(Produto produto : produtos){
        %>
        <div>
            <p><%=produto.getNome()%></p>
            <a href="produto-detalhe?id=<%=produto.getCod()%>">
            <img src="produto <%=produto.getCod()%>"/>
            </a>
            <p>R$ <%=produto.getPreço()%></p>
        </div>
            <%
            }
            %>
        </body>
</html>
