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
        <title>Avis Comunale Cagliari</title>
        <meta name="author" content="Manolo Sainas">
        <meta name="description" content="Il sito dell'Avis di Cagliari">
        <meta name="keywords" content="avis, Cagliari, donazione, sangue">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>   
        
            <div id="listaSessioni">
                <c:if test="${empty listaSessioni}">
                    <c:redirect url="HomeServlet"/>
                </c:if>
                
                <c:if test="${not empty listaSessioni}">
                    <a href="index.jsp"><img title="Logo dell'Avis comunale di Cagliari" alt="Logo Avis Cagliari" src="img/logo-Avis.png" 
                        width="368" height="73"> </a>
                    <div>
                        <p><b>Effettua il login:</b></p>
                        <button onclick="document.location='login.jsp'">Login</button>
                        <p><b>Registrati nel sito:</b></p>
                        <button onclick="document.location='registrazione.jsp'">Registrati</button>
                    </div>
                    
                    <div>  
                        <h2>Lista delle sessioni disponibili</h2>
                        <div>
                            <c:forEach items="${listaSessioni}" var="sessione">
                                <p>
                                    Data: ${sessione.getData()} Ora inizio: ${sessione.getOrarioInizio()}
                                    Ora fine: ${sessione.getOrarioFine()} Luogo: ${sessione.getLuogo()}</p>
                            </c:forEach>
                        </div>
                    </div>    
                </c:if>       
            </div>
        
    </body>
</html>
