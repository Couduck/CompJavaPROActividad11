<%-- 
    Document   : resultado
    Created on : Apr 12, 2023, 7:53:49 PM
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
        <h1>El resultado de la operación fue el siguiente: </h1> <br>
        
        <h2>${requestScope.flt1} + ${requestScope.flt2} = ${requestScope.resultadoValor}</h2>
    </body>
</html>
