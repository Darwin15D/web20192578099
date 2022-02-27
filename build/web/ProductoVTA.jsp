<%-- 
    Document   : ProductoVTA
    Created on : 8/02/2022, 12:46:59 AM
    Author     : Darwin Melo Perez
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name"viewport" content="width = divice-width, initial-scale=1, shrink-to-fit=no">
        <title>Vista de productos</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

    </head>
    <body>
        <div class="container"> 
            <div class="row">
                <h1>Productos</h1>
            </div>
            <div class="row">
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Nº Id</th>
                                <th>Nombre</th>
                                <th>Descripción</th>
                                <th>Valor</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="objP" items="${lista_productos}">
                                <tr>
                                    <td>${objP.getId_prod()}</td>
                                    <td>${objP.getNombre_prod()}</td>
                                    <td>${objP.getDescripcion_prod()}</td>
                                    <td>${objP.getUnd()}</td>
                                    <td>${objP.getValor()}</td>
                                    <td>
                                        <a type="button" class="btn btn-outline-success" style="height: 35px; width: 80px;">Ver</a>
                                        <a type="button" class="btn btn-outline-warning" style="height: 35px; width: 80px;">Editar</a>
                                        <a type="button" class="btn btn-outline-danger" style="height: 35px; width: 80px;" 
                                                href="ProductoCTO?accion=eliminar&id=${objP.getId_prod()}">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
    </body>
</html>
