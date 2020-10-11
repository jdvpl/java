
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./stilo.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
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
                       
                </div>        
            </nav>
        <div class="alert alert-danger container mt-5" role="alert">
            <h4 class="alert-heading">Error</h4>
            <p>Por favor debes llenar todos los campos</p>
            <hr>
            <p class="mb-0">debes asegurarte de llenar todos los campos</p>
        </div>
    </body>
</html>
