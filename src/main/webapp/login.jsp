<%-- 
    Document   : login
    Created on : 10-sep-2021, 12:41:12
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    </body>
</html>
