<%-- 
    Document   : index
    Created on : 1 nov. 2020, 18:45:38
    Author     : juand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del Usuario</h1>
            <form action="servletRegistro" method="POST"> <br>
            Usuario: <input type="text" name="usuario"/><br>
            correro: <input type="email" name="correro"/><br>
            Nombre: <input type="text" name="nombre"/><br>
            Apellido: <input type="text" name="apellido"/><br>
            Clave: <input type="password" name="password"/><br>
            <input type="submit" value="Guardar"/>
            
            </form>
    </body>
</html>
