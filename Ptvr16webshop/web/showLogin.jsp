<%--
    Document   : ShowLogin
    Created on : Dec 4, 2018, 10:30:35 AM
    Author     : Anton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Регистрация</title>
                <style>
        </style>
    </head>
    <body>

               <h3>Введите Логин и Пароль</h3>
        ${info}<br>
        <form action="login" method="POST" name="form1" id="_form1">
             Логин:<br>
            <input type="text" name="login"><br>
            <br>
             Пароль:<br>
            <input type="password" name="password"><br>
            <br>
            <input type="submit" value="Войти">
        </form><br><br>
        <a href="newCustomer">Зарегистрироваться</a>
        </form><br>
    </body>
</html>
