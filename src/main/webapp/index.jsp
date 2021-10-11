<%-- 
    Document   : index
    Created on : 10-sep-2021, 12:39:02
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Landing Page</title>
    </head>
    <body>
        <%
    if (request.getSession(false) == null) { %>        
        <a href='login.jsp'><button>Login</button></a>
        <a href='forms/registro.jsp'><button>Registro</button></a>
        <a href='TestManyToMany'><button>Test</button></a>
    <%} else { %>
        <a href='LogoutServlet'><button>Cerrar Sesión</button></a><br>
        <a href='forms/perfil.jsp'><button>Modificar Perfil</button></a>
    <% }%>
        <br>
        <%@include file="WEB-INF/jspf/listaActividades.jspf" %> 
    </body>
</html>
