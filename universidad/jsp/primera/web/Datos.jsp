
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Persona"%>
<% Persona p1=(Persona) request.getSession().getAttribute("persona1"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MVC</title>
        <meta charset="UTF-8">
         <link rel="stylesheet" href="./stilo.css">
        <script src="https://kit.fontawesome.com/f47a415fda.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    
    </head>
    <body>
        <nav class="navbar navbar-expand-lg menu" id="inicio">
                <a class="navbar-brand" href="#"><img src="./img/jsp.png" alt="alt" height="40"/></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="./index.jsp">Inicio<span class="sr-only">(current)</span></a>
                        </li>
                    </ul>
                </div>        
            </nav>
        <div class="container">
            
        
        <div class="card m-auto" style="width: 25rem;">
            <img src="./img/usuario.png" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title"><b>Nombre: </b><%=p1.getNombre()%> <%=p1.getApellido()%></h5>
                <p class="card-text"><b class="pl-4">Biografia: </b><%=p1.getDescripcion()%></p>
            </div>
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><b>Edad: </b><%=p1.getEdad()%></li>
                <li class="list-group-item"><b>Pais: </b><%=p1.getPais()%></li>
                <li class="list-group-item"><b>Pais: </b><%=p1.getCiudad()%></li>
            </ul>
            <div class="card-body">
                <a href="./index.jsp" class="card-link nav-link text-center">Inicio</a>
            </div>
        </div>
</div>
    </body>
</html>
