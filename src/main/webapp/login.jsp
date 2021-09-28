<%-- 
    Document   : login
    Created on : 10-sep-2021, 12:41:12
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form method="GET" action="./PreLoginServlet">
            <label for="usuario">Usuario</label>
            <input type="text" name="usuario" id="usuario">
            <label for="password">Contraseña</label>
            <input type="password" name="password" id="contraseña">
            <br><br>
            <input type="submit" value="Enviar">
        </form>
        <a href="index.jsp"><button>Volver</button></a>
        <c:out value="${badLogin != null?'El usuario no existe':''}" />
        <c:out value="${registrado != null?'Usuario registrado con exito':''}" />
    </body>
</html>
