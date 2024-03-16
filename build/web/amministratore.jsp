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
        <title>Pagina Amministratore</title>
        <meta name="author" content="Manolo Sainas">
        <meta name="description" content="Pagina principale dell'amministratore">
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
            <h1>Pagina principale Amministratore</h1>
        
            <button onclick="document.location='index.jsp'">Effettua il logout</button>
            <p><b>Inserisci una nuova sessione di donazione:</b></p>
            <button onclick="document.location='nuovaSessione.jsp'">Inserisci una nuova sessione</button>
            <p><b>Archivia o rimuovi donazioni:</b></p>
            <button onclick="document.location='gestisciDonazioni.jsp'">Gestisci donazioni</button>
            <p><b>Visualizza la lista dei donatori:</b></p>
            <button onclick="document.location='listaDonatori.jsp'">Lista donatori</button>
        
        </c:if>
    </body>
</html>
