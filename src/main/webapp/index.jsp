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
            if (request.getSession(false) == null) {
                out.write("<a href='login.jsp'><button>Login</button></a>");
                out.write("<a href='forms/registro.jsp'><button>Registro</button></a>");
                out.write("<a href='TestManyToMany'><button>Test</button></a>");
            } else {
                out.write("<a href='LogoutServlet'><button>Cerrar Sesión</button></a><br>");
                out.write("<a href='forms/perfil.jsp'><button>Modificar Perfil</button></a>");
            }
        %>
    </body>
</html>
