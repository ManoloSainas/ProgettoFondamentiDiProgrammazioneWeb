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
        <title>Pagina principale</title>
        <meta name="author" content="Manolo Sainas">
        <meta name="description" content="La pagina principale che si vede dopo il login">
        <meta name="keywords" content="avis, Cagliari, donazione, sangue">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
    <body>
        <a href="paginaPrincipale.jsp"><img title="Logo dell'Avis comunale di Cagliari" alt="Logo Avis Cagliari" src="img/logo-Avis.png" 
             width="368" height="73"> </a>
        
        <c:if test="${empty user}">
            <c:redirect url="login.jsp"/>
        </c:if>
        
        <c:if test="${not empty user}">
            <h1>Ciao ${user}!</h1>
            <p>Ultimo accesso: ${lastLogin}</p>
        
        
            <h2>Pagina principale</h2>
            <button onclick="document.location='logoutServlet'">Effettua il logout</button>
        
            <p><b>Prenota la tua donazione:</b></p>
            <button onclick="document.location='prenota.jsp'">Prenota</button>
            <p><b>Accedi alla tua pagina personale:</b></p>
            <button onclick="document.location='paginaPersonale.jsp'">Pagina personale</button>
            <p><b>Visualizza le tue donazioni effettuate nel tempo:</b></p>
            <button onclick="document.location='donazioniEffettuate.jsp'">Donazioni effettuate</button>
        
        </c:if>
    </body>
</html>
