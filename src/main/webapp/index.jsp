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
        <%@include file="WEB-INF/jspf/bootstrap.jspf" %>
        <%@include file="WEB-INF/jspf/bootstraptest.jspf" %>
        <link rel="stylesheet" href="WEB-INF/css/csstest.css"
        
    </head>
    <body>
        <%
    if (request.getSession(false) == null) { %>        
        <a href='login.jsp'><button>Login</button></a>
        <a href='forms/registro.jsp'><button>Registro</button></a>
    <%} else { %>
        <a href='LogoutServlet'><button>Cerrar Sesión</button></a><br>
        <a href='forms/perfil.jsp'><button>Modificar Perfil</button></a>
    <% }%>
        <a href='AddUsuarioToActividad'><button>Test</button></a>
        <br>
        <%@include file="WEB-INF/jspf/listaActividades.jspf" %> 
    </body>
</html>
