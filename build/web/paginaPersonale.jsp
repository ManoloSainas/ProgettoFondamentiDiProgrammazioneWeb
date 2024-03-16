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
        <title>Pagina personale</title>
        <meta name="author" content="Manolo Sainas">
        <meta name="description" content="La pagina personale della persona che ha effettuato il login">
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
            
            <h1>Pagina personale</h1>
            <h2>Qui potrai modificare i tuoi dati personali</h2>
        
            <form action="paginaPersonaleServlet" method="post">
                <p>
                    <label for="user">Modifica il tuo username</label>
                    <input type="text" name ="username" id="user"
                        pattern="^[a-zA-Z0-9_-]{5,15}" placeholder="" required/><br>
                    <label for="pass">Modifica la password</label>
                    <input type="password" name ="password" id="pass"
                        pattern="^[a-zA-Z0-9_-]{5,15}" placeholder=""  required/><br>
                    <label for="pass1">Reinserire la nuova password</label>
                    <input type="password" name ="pass1" id="pass1"
                        pattern="^[a-zA-Z0-9_-]{5,15}" placeholder=""  required/><br>
                </p> 
            
                <p>
                    <label for="nome">Modifica il tuo nome</label>
                    <input type="text" name ="nome" id="nome" placeholder="" required/><br>
                    <label for="cognome">Modifica il tuo cognome</label>
                    <input type="text" name ="cognome" id="cognome" placeholder=""  required/><br>
                </p> 
            
                <p>
                    <label for="data">Modifica la tua data di nascita</label>
                    <input type="date" name ="data" id="data" placeholder=""  required/>
                </p>
            
                <p>
                    <label for="codicefiscale">Modifica il tuo codice fiscale</label>
                    <input type="text" id="codicefiscale" 
                        pattern="^[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]$" placeholder=""  required>
                </p>
            
                <p>
                    <label for="email">Modifica la tua email:</label>
                    <input type="email" id="email" placeholder=""  name="email"
                        pattern="^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$" required>
                </p>
            
                <p>
                    <label for="telefono">Modifica il tuo numero di cellulare</label>
                    <input type="text" id="telefono" 
                        pattern="^[[0-9]{9,10}$" placeholder=""  required>
                </p>
            
                <p>
                    <label for="gruppo">Modifica il tuo gruppo sanguigno</label>
                    <select name="gruppo" id="gruppo" placeholder=""  required>
                        <option></option>
                        <option value="A+">A Rh D positivo (A+)</option>
                        <option value="A-">A Rh D negativo (A-)</option>
                        <option value="B+">B Rh D positivo (B+)</option>
                        <option value="B-">B Rh D negativo (B-)</option>
                        <option value="0+">0 Rh D positivo (0+)</option>
                        <option value="0-">0 Rh D negativo (0-)</option>
                        <option value="AB+">AB Rh D positivo (AB+)</option>
                        <option value="AB-">AB Rh D negativo (AB-)</option>                  
                    </select>
                </p>
            
                <p>
                    <label for="pat">Modifica eventuali patologie</label><br>
                    <textarea name="patologie" id="pat" rows="5" cols="50" placeholder="inserisci un messaggio" placeholder="" >
                    </textarea>
                </p>
            
               <input type="submit" value="Salva modifiche"/>
            </form>
            
        </c:if>
        
    </body>
</html>
