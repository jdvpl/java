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
         <link rel="stylesheet" href="./stilo.css">
        <script src="https://kit.fontawesome.com/f47a415fda.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
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
    </body>
</html>
