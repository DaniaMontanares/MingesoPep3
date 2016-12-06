<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informacion Productos</title>
        
    </head>
    <body action="ProductoServlet">
        <h1>Información Productos </h1>
        <form action="./ProductoServlet" method="POST">
            <table>
                <tr>
                    <td>Codigo producto</td>
                    <td><input type="text" name="codigo" value="${producto.codigo}" /></td>
                </tr>
                <tr>
                    <td>Nombre Producto</td>
                    <td><input type="text" name="nombre" value="${producto.nombre}" /></td>
                </tr>
                <tr>
                    <td>Descripcion Producto</td>
                    <td><input type="text" name="descripcion" value="${producto.descripcion}" /></td>
                </tr>
                <tr>
                    <td>Precio Producto</td>
                    <td><input type="text" name="precio" value="${producto.precio}" /></td>
                </tr>
                <tr>
                    <td>Foto Producto</td>
                    <td><input type="text" name="foto" value="${producto.foto}" /></td>
                </tr>
                <tr>
                    <td>Ciudad Producto</td>
                    <td><input type="text" name="ciudad" value="${producto.ciudad}" /></td>
                </tr>
                <tr>
                    <td>Nombre Anunciante</td>
                    <td><input type="text" name="nombreAnunciante" value="${producto.nombreAnunciante}" /></td>
                </tr>
                <tr>
                    <td>Telefono Anunciante</td>
                    <td><input type="text" name="telefonoAnunciante" value="${producto.telefonoAnunciante}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Edit" />
                        <input type="submit" name="action" value="Delete" />
                        <input type="submit" name="action" value="Search" />
                    </td>                
                </tr>            
            </table>
        </form>        
        <br>
        <table border="1">
            <th>Id</th>
            <th>Nombre</th>
            <th>Cantidad</th>
            <c:forEach items="${allProductos}" var="product">
                <tr>
                    <td>${product.codigo}</td>
                    <td>${product.nombre}</td>
                    <td>${product.descripcion}</td>
                    <td>${product.precio}</td>
                    <td>${product.foto}</td>
                    <td>${product.ciudad}</td>
                    <td>${product.nombreAnunciante}</td>
                    <td>${product.telefonoAnunciante}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
