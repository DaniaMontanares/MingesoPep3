<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información Productos</title>
        <script languaje="Javascript" type="text/javascript" src="js/main.js"></script>
        <script languaje="Javascript" type="text/javascript" src="js/bootstrap.js"></script>
        <script languaje="Javascript" type="text/javascript" src="js/jquery.js"></script>
        <link href="css/bootstrap.css" rel="stylesheet">
    </head>
    <body action="ProductoServlet">
        <nav class="navbar navbar-static-top" style="background-color: #f18b29;">
            <a class="navbar-brand topnav" href="/MingesoPep3" style="color:#ececec;">Mingeso: Pep 3</a>
        </nav>
        <div class="container">
            <div class="row">
                <h3>Listado de Productos</h3>
                <table class="table table-bordered table-hover">
                    <thead>
                        <tr>
                            <th width="7%" style="vertical-align: middle;">Codigo</th>
                            <th width="12%" style="vertical-align: middle;">Nombre</th>
                            <th width="30%" style="vertical-align: middle;">Descripción</th>                              
                            <th width="5%" style="vertical-align: middle;">Precio</th>
                            <th width="10%" style="vertical-align: middle;">Foto</th>
                            <th width="10%" style="vertical-align: middle;">Ciudad</th>
                            <th width="10%" style="vertical-align: middle;">Nombre<br/>Anunciante</th>
                            <th width="10%" style="vertical-align: middle;">Correo<br/>Anunciante</th>
                            <th width="5%" style="vertical-align: middle;">Borrar</th>
                        </tr>
                    </thead>
                    <c:forEach items="${allProductos}" var="product">
                    <tr>
                        <td>${product.codigo}</td>
                        <td>${product.nombre}</td>
                        <td>${product.descripcion}</td>
                        <td>${product.precio}</td>
                        <td>${product.foto}</td>
                        <td>${product.ciudad}</td>
                        <td>${product.nombreAnunciante}</td>
                        <td>${product.correoAnunciante}</td>
                        <td><button type="button" class="btn btn-default btn-sm" disabled="true">
          <span class="glyphicon glyphicon-trash"></span> Borrar</button></td>
                    </tr>
                    </c:forEach>
                </table>                    
            </div>
            <div class="row">
                <form action="./ProductoServlet" method="POST" class="form-inline table-bordered">
                    <div class="form-group">
                        <div class="col-me-6" style="padding:10px;">
                            <label style="width:150px;" for="nombre">Nombre Producto</label style="width:150px;">
                            <input type="text" name="nombre" id="nombre" class="form-control" value="${producto.nombre}" />
                            <input type="hidden" name="codigo" value="${producto.codigo}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-me-6" style="padding:10px;">
                            <label style="width:150px;" for="precio">Precio Producto</label style="width:150px;">
                            <input type="number" name="precio" id="precio" class="form-control" value="${producto.precio}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-me-6" style="padding:10px;">
                            <label style="width:150px;" for="foto">Foto Producto</label style="width:150px;">
                            <input type="text" name="foto" id="foto" class="form-control" value="${producto.foto}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-me-6" style="padding:10px;">
                            <label style="width:150px;" for="ciudad">Ciudad Producto</label style="width:150px;">
                            <input type="text" name="ciudad" id="ciudad" class="form-control" value="${producto.ciudad}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-me-6" style="padding:10px;">
                            <label style="width:150px;" for="descripcion">Descripción Producto</label style="width:150px;">
                            <textarea class="form-control" name="descripcion" id="descripcion" class="form-control" rows="2" cols="75">${producto.descripcion}</textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-me-6" style="padding:10px;">
                            <label style="width:150px;" for="nombreAnunciante">Nombre Anunciante</label style="width:150px;">
                            <input type="text" name="nombreAnunciante" id="nombreAnunciante" class="form-control" value="${producto.nombreAnunciante}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-me-6" style="padding:10px;">
                            <label style="width:150px;" for="correoAnunciante">Correo Anunciante</label style="width:150px;">
                            <input type="mail" name="correoAnunciante" id="correoAnunciante" class="form-control" value="${producto.correoAnunciante}" />
                        </div>
                    </div>
                    <br/><br/>
                    <div class="form-group" style="padding: 20px;">
                        <input type="submit" name="action" class="btn btn-primary" value="Agregar">
                        <input type="submit" name="action" class="btn btn-warning" value="Editar" disabled="true">
                    </div>
                </form>
            </div>
        </div>
        <footer style="position: relative; bottom: 0px; padding:20px;">
            <center><p>&copy; Grupo 1: Blot, Marquez, Montanares, Ulloa</p></center>
        </footer>
    </body>
</html>