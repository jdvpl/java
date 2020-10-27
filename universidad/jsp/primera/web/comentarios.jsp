<%-- 
    Document   : comentarios
    Created on : 11 oct. 2020, 10:31:00
    Author     : juand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Comentario" %>
<% Comentario comen=(Comentario) request.getSession().getAttribute("mensaje"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MVC</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="./stilo.css"/>
          <script src="https://kit.fontawesome.com/f47a415fda.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="shortcut icon" href="./img/logo.png" type="image/x-icon">
        <meta name='viewport' content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' />
        <style>
            table th{
                text-align: center;
            }
            table td{
                text-align: center;
            }
        </style>
    </head>
    <body>
    <body>
      <nav class="navbar navbar-expand-lg menu text-center" id="inicio">
        
            <a class="navbar-brand pl-5 ml-5 m-auto" href="#"><img src="./img/jsp.png" alt="alt" height="40"/></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link text-center" href="./index.jsp">Inicio<span class="sr-only">(current)</span></a>
                    </li>
            </div>        
        </nav>
        <section id="actividades" class="my-5 container">
        <div class="table-responsive-xl">
            <table class="table table-hover">
                <thead class="thead-dark">
                    <tr><th colspan="2">Comentarios</th></tr>
                    <tr>
                        <th scope="col">Nombre</th>
                        <th scope="col">Mensaje</th>

                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th class="text-capitalize"><%=comen.getNombre()%></th>
                        <td><%=comen.getComentario()%></td>
                    </tr>
                 
                </tbody>
            </table>
        </div> 
         <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
   
    </body>
</html>
