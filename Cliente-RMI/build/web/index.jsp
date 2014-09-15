<%-- 
    Document   : busqueda
    Created on : 15-07-2014, 10:56:00 AM
    Author     : daniel
--%>

<%@page import="cliente.Cliente"%>
<%@page import="eda.Tweet"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Ejemplo JSP con RMI</title>

        <!-- Bootstrap core CSS -->
        <link type="text/css" href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Estilo</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="#">Buscar</a></li>
                        <li><a href="#">Acerca</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div>

        <br><br><br>
        <h1>Búsqueda</h1>
        <div class="container">
            <div class="text-center">
                <%
                    Cliente cliente = new Cliente();
                    ArrayList<Tweet> tweets = cliente.inicializar();
                    if (tweets != null) {
                %>
                <table class="table table-hover">
                    <tr>
                        <td>#</td>
                        <td>User</td>
                        <td>Text</td>
                    </tr>
                    <%
                        for (Tweet tweet : tweets) {
                    %><tr>
                        <td><%out.print(tweet.getId());%></td>
                        <td><%out.print(tweet.getNickname());%></td>
                        <td><%out.print(tweet.getText());%> </td>
                    </tr>
                    <%
                        }
                    %>
                </table>
                <%
                    } else {
                        out.print("No existen coincidencias...");
                    }
                %>
            </div>
        </div>
    </body>
</html>
