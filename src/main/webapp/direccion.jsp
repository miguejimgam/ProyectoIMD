<%-- 
    Document   : direccion
    Created on : 28-sep-2021, 13:29:02
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
        <form method="GET" action="./PostDireccionServlet">
            <label for="calle_direccion">Calle: </label>
            <input type="text" name="calle_direccion" id="calle_direccion"><br>
            <label for="numero_direccion">Numero: </label>
            <input type="text" name="numero_direccion" id="numero_direccion"><br>
            <label for="bloque_direccion">Bloque: </label>
            <input type="text" name="bloque_direccion" id="bloque_direccion"><br>
            <label for="portal_direccion">Portal: </label>
            <input type="text" name="portal_direccion" id="portal_direccion"><br>
            <label for="piso_direccion">Piso:  </label>
            <input type="text" name="piso_direccion" id="piso_direccion"><br>
            <label for="puerta_direccion">Puerta: </label>
            <input type="text" name="puerta_direccion" id="puerta_direccion"><br>
            <label for="localidad_direccion">Localidad: </label>
            <input type="text" name="localidad_direccion" id="localidad_direccion"><br>
            <label for="cp_direccion">Código postal: </label>
            <input type="text" name="cp_direccion" id="cp_direccion"><br>
            <label for="provincia_direccion">Provincia: </label>
            <input type="text" name="provincia_direccion" id="provincia_direccion">
            <br><br>
            <input type="submit" value="Enviar">
        </form>
        <a href="index.jsp"><button>Volver</button></a></body>
</html>
