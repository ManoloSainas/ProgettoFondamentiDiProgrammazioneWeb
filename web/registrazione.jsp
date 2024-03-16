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
        <title>Registrazione</title>
        <meta name="author" content="Manolo Sainas">
        <meta name="description" content="Pagina della registrazione al sito">
        <meta name="keywords" content="avis, Cagliari, donazione, sangue">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <a href="index.jsp"><img title="Logo dell'Avis comunale di Cagliari" alt="Logo Avis Cagliari" src="img/logo-Avis.png" 
             width="368" height="73"> </a>
        <h1>Registrazione</h1>
        
        <form action="registrazioneServlet" method="post">
            <p>
                <label for="user">Scegli un username(min 5 e max 15 caratteri)</label>
                <input type="text" name ="username" id="user"
                       pattern="^[a-zA-Z0-9_-]{5,15}" placeholder="Username" required/><br>
                <label for="pass">Scegli una password(min 5 e max 15 caratteri)</label>
                <input type="password" name ="password" id="pass"
                       pattern="^[a-zA-Z0-9_-]{5,15}" placeholder="Password"  required/><br>
                <label for="pass2">Ripeti la password</label>
                <input type="password" name ="pass2" id="pass1" 
                       pattern="^[a-zA-Z0-9_-]{5,15}" placeholder="Ripeti la password"  required/><br>
            </p> 
            
            <p>
                <label for="nome">Inserisci il tuo nome</label>
                <input type="text" name ="nome" id="nome" placeholder="Nome" required/><br>
                <label for="cognome">Inserisci il tuo cognome</label>
                <input type="text" name ="cognome" id="cognome" placeholder="Cognome"  required/><br>
            </p> 
            
            <p>
                <label for="data">Inserisci la tua data di nascita</label>
                <input type="date" name ="data" id="data" required/>
            </p>
            
            <p>
                <label for="codicefiscale">Inserisci il tuo codice fiscale</label>
                <input type="text" id="codicefiscale" name="codicefiscale"  
                       pattern="^[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]$" required>
            </p>
            
            <p>
                <label for="maschio">Maschio</label>
                <input type="radio" name ="sesso" id="maschio" required/><br>
                <label for="femmina">Femmina</label>
                <input type="radio" name ="sesso" id="femmina" required/><br>
            </p>
            
            <p>
                <label for="email">Inserisci la tua email:</label>
                <input type="email" id="email" name="email"
                       pattern="^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$" required/>
            </p>
            
            <p>
                <label for="telefono">Inserisci il tuo numero di cellulare</label>
                <input type="text" id="telefono" name="telefono"
                    pattern="^[0-9]{9,10}$" required>
            </p>
            
            <p>
                <label for="gruppo">Seleziona il tuo gruppo sanguigno</label>
                <select name="gruppo" id="gruppo" required>
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
                <label for="pat">Inserisci eventuali patologie</label><br>
                <textarea name="patologie" id="pat" rows="5" cols="50" placeholder="inserisci un messaggio">
                </textarea>
            </p>
            
            <input type="submit" value="Registrati"/>
        </form>
        
    </body>
</html>
