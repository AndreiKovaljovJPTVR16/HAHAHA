<%-- 
    Document   : newProduct
    Created on : 16-Oct-2018, 21:18:29
    Author     : Anton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--<link rel="stylesheet" href="${pageContext.request.contextPath}/css/newProduct.css">-->
        <title>Новый товар</title>
        <style>
        </style> 
    </head>
    <body>
        <h3 style='margin-left: 100px;color:red;'>Добавление нового товара</h3>
        <form action="addProduct" method="POST" name="form1" id="_form1">
            Название:<br>
            <input type="text" name="name"><br><br>
            Цена товара:<br>
            <input type="text" name="price"><br><br>
            Количество товаров:<br>
            <input type="text" name="count"><br><br>
            <br>
            <input type="submit" value="Добавить">
        </form><br><br>
<!-- <script scr="${pageContext.request.contextPath}/js/newProduct.js"></a> -->

    </body>
</html>
