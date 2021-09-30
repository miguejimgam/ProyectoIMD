<%-- 
    Document   : perfil
    Created on : 28-sep-2021, 12:16:47
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
        <form method="GET" action="../PreCambiarServlet">
            <label for="email">email:  </label>
            <input type="text" name="email" id="email" value="${loggedUser!=null?loggedUser.nickUsuario:''}"><br>
            <label for="name">Nombre: </label>
            <input type="text" name="name" id="name" value="${loggedUser!=null?loggedUser.nombreUsuario:''}"><br>
            <label for="surname">Apellido: </label>
            <input type="text" name="surname" id="surname" value="${loggedUser!=null?loggedUser.apellidoUsuario:''}"><br>
            <label for="telefono">Telefono: </label>
            <input type="text" name="telefono" id="telefono" value="${loggedUser!=null?loggedUser.telefonoUsuario:''}"">
            <br><br>
            <input type="submit" value="Enviar">
        </form>
        <a href="index.jsp"><button>Volver</button></a>    
    </body>
</html>
