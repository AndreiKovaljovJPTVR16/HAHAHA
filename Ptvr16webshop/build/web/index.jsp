

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Онлайн магазин</title>
    </head>
    <body>
 <h1>Навигация</h1>
        ${info}<br>
        <a href="showLogin"> Логин </a><br>
        <a href="logout"> Логаут </a><br>
        <a href="newProduct">Добавить товар</a><br>
        <a href="newCustomer">Добавить покупателя</a><br>
        <a href="showProducts">Список товаров</a><br>
        <a href="showCustomer">Список покупателей</a><br>
        <a href="shop">Купить </a><br>
        <a href="showBuyProduct">Список купленного товара</a><br>
        <p> Для администратора:<br>
          <a href="editUserRoles">Назначение ролей пользователям</a></p>
    </body>
</html>
