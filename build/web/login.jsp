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
        <title>Login</title>
        <meta name="author" content="Manolo Sainas">
        <meta name="description" content="Pagina del login al sito">
        <meta name="keywords" content="avis, Cagliari, donazione, sangue">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <a href="index.jsp"><img title="Logo dell'Avis comunale di Cagliari" alt="Logo Avis Cagliari" src="img/logo-Avis.png" 
             width="368" height="73"> </a>
        
        <h1>Login</h1>
        
        <form action="loginServlet" method="post">
            <label for="user">Username</label>
            <input type="text" id="user" name="user" placeholder="Username" required/>
            <label for="pass">Password</label>
            <input type="password" id="pass" name="pass" placeholder="Password" required/>
            <input type="submit" value="Accedi"/>     
        </form>
        
    </body>
</html>
