<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <!--formularrio-->
        <nav class="navbar navbar-expand-lg menu" id="inicio">
                <a class="navbar-brand" href="#"><img src="./img/jsp.png" alt="alt" height="40"/></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Inicio<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#contactenos">Comentarios</a>
                        </li> 
                </div>        
            </nav>
        <div class="container">
            
            <!-- jumbotrom -->
            <div>
                <img src="./img/modelo.jpg" alt="" class="mt-5 borde img-fluid img">
            </div>
            
            <form action="procesador.do" method="POST">
            <div class="form-row">
                <div class="col-md-6 mb-3">
                    <label for="validationDefault01">Nombres</label>
                    <input type="text" class="form-control" placeholder="Nombres" name="txtNombre">
                </div>
                <div class="col-md-6 mb-3">
                    <label for="validationDefault02">Apellidos</label>
                    <input type="text" class="form-control" placeholder="Apellidos" name="txtApellidos">
                </div>
            </div>
            <div class="form-row">
                <div class="col-md-6 mb-3">
                    <label for="validationDefault03">Pais</label>
                    <input type="text" class="form-control" placeholder="Pais" name="txtPais">
                </div>
                <div class="col-md-3 mb-3">
                    <label for="validationDefault04">Ciudad</label>
                    <input type="text" class="form-control" placeholder="Ciudad" name="txtCiudad"/>
                </div>
                <div class="col-md-3 mb-3">
                    <label for="validationDefault05">Edad</label>
                    <input type="text" class="form-control" placeholder="Edad" name="txtEdad">
                </div>
                
            </div>
                <div class="form-group text-uppercase">
                    <label for="">Descripcion</label>
                    <textarea name="descripcion" class="textarea form-control" maxlength="200"></textarea>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <input type="submit" class="btn btn-primary btn-lg btn-block" value="Enviar"/>
                    </div>
                    <div class="col-md-6">
                        <input type="reset" class="btn btn-danger btn-lg btn-block" value="Borrar"/>
                    </div>
                </div>
        </form>
       </div>

            <section class="contactenos mt-5 pt-5" id="contactenos">
                <div class="container">
                    <div class="row">
                    </div>
                    <div class="row clearfix">
                        <div class="offset-sm-2 col-sm-8">
                            <div class="headerText">
                                <h2 class="text-center text-uppercase pt-5">Comentarios</h2>
                            </div>
                            <form action="jiren.do" method="post">
                                <div class="form-group">
                                    <div class="form-group text-uppercase">
                                        <label for="">nombre</label>
                                        <input type="text" name="nombre" value="" class="form-control">
                                    </div>
                                    <div class="form-group text-uppercase">
                                        <label for="">mensaje</label>
                                        <textarea name="mensaje" class="textarea form-control" maxlength="200"></textarea>
                                    </div>
                                    <div class="form-group text-center">
                                        <input type="submit" value="enviar" id="boton" class="btn btn-outline-light" />
                                    </div>
                                </div>
                            </form>
                            
                            
                         
                        </div>
                    </div>
                    <a class="nav-link float-right" href="#inicio"><i class="fas fa-arrow-up text-white"></i></a>
                    
                </div>
                <p class="text-center pt-5 mt-5 text-white">Para más información al 3209188638<br>o al correo
                    jsuarez130@estudiantes.arenadina.edu.co</p>
            </section>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
