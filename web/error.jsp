<%-- 
    Document   : error
    Created on : Feb 14, 2022, 10:15:40 AM
    Author     : fpw
--%>
 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <link rel="stylesheet" type="text/css" href="stye.css" media="screen">
    </head>
    <body>
        <h1>Error: ${errorMessage}</h1>
        <p><b>Torna nella pagina principale:</b></p>
        <button onclick="document.location='paginaPrincipale.jsp'">Pagina Principale</button>
    </body>
</html>
