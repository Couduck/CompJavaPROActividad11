<%-- 
    Document   : error
    Created on : Apr 12, 2023, 7:54:04 PM
    Author     : patoe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ERROR! La operacion no pudo llevarse a cabo debido al siguiente motivo: </h1> <br>
        
        <h2>${requestScope.mensajeError}</h2>
    </body>
</html>
