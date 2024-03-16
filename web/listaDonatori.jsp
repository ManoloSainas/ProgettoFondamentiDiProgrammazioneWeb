<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Lista donatori</title>
        <meta name="author" content="Manolo Sainas">
        <meta name="description" content="La pagina dell'amministatore dove poter 
              visualizzare la lista dei donatori">
        <meta name="keywords" content="avis, Cagliari, donazione, sangue">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <a href="amministratore.jsp"><img title="Logo dell'Avis comunale di Cagliari" alt="Logo Avis Cagliari" src="img/logo-Avis.png" 
             width="368" height="73"> </a>
        
        <c:if test="${empty user}">
            <c:redirect url="login.jsp"/>
        </c:if>
        
        <c:if test="${not empty user}">        
            <h1>Lista dei donatori</h1>
        </c:if>
        
    </body>
</html>
