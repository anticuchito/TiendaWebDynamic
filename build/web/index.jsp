<%-- 
    Document   : index
    Created on : 15-oct-2021, 21:09:04
    Author     : anticuchito
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Tienda</title>
    </head>
    <%
        ArrayList<Producto> listProduct = new ArrayList();
        
        Producto prod1 = new Producto();
        prod1.setNombreProducto("manzana");
        prod1.setDescProducto("this is a apple");
        prod1.setImgProducto("https://cbrl-ecom-images.s3.amazonaws.com/FY21/Summer-Cottage-KN-MIS/754071-0.jpg");
        prod1.setPrecioProducto(2000);
        prod1.setLargo(100);
        prod1.setAlto(200);
        prod1.setPeso(1);
        listProduct.add(prod1);
        Producto prod2 = new Producto();
        prod2.setNombreProducto("tomate");
        prod2.setDescProducto("this is a tomato");
        prod2.setImgProducto("https://image.freepik.com/foto-gratis/tomate-rojo-fresco-aislado-blanco_1205-548.jpg?1");
        prod2.setPrecioProducto(3000);
        prod2.setLargo(50);
        prod2.setAlto(100);
        prod2.setPeso(2);
        listProduct.add(prod2);
        Producto prod3 = new Producto();
        prod3.setNombreProducto("lechuga");
        prod3.setDescProducto("this is a lettuce");
        prod3.setImgProducto("https://st.depositphotos.com/1276052/1414/i/600/depositphotos_14146812-stock-photo-fresh-green-lettuce-isolated.jpg");
        prod3.setPrecioProducto(1000);
        prod3.setLargo(100);
        prod3.setAlto(100);
        prod3.setPeso(1);
        listProduct.add(prod3);
        Producto prod4 = new Producto();
        prod4.setNombreProducto("saco de papas");
        prod4.setDescProducto("this is a sack of potatoes");
        prod4.setImgProducto("https://static7.depositphotos.com/1005708/789/i/950/depositphotos_7899312-stock-photo-raw-potatoes.jpg");
        prod4.setPrecioProducto(5000);
        prod4.setLargo(200);
        prod4.setAlto(200);
        prod4.setPeso(5);
        listProduct.add(prod4);
        Producto prod5 = new Producto();
        prod5.setNombreProducto("limones");
        prod5.setDescProducto("this is a lemon");
        prod5.setImgProducto("https://st4.depositphotos.com/1642482/19767/i/600/depositphotos_197675786-stock-photo-lime-isolated-on-white.jpg");
        prod5.setPrecioProducto(2000);
        prod5.setLargo(100);
        prod5.setAlto(200);
        prod5.setPeso(1);
        listProduct.add(prod5);
        
    %>
        
    <body>
        <nav class="nabar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Tienda Generica</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Productos</a>
        </li>
      </ul>
        <a href="#"><i class="fas fa-shopping-cart" style="color:white"></i></button>
    </div>
  </div>
</nav>
    </body>
</html>
