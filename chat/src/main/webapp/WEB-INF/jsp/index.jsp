<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Preisler</title>
    <mvc:resources mapping="/resources/**" location="/resources/static/" />
    <link href="/style/style.css" rel="stylesheet"/>
    <script src="/script/app.js" defer></script>
</head>
<body>
    <div id="cont">
    <div id="MOTD">
        <h1>Üdv ez egy test project! Ami egy chat app</h1>
        <p>"${text}"</p>
    </div>
    <div id="login-cont">
        <form action="/login" method="post">
            <label for="username">Username: </label>
            <input type="text" name="username">
            <label for="password">Password: </label>
            <input type="password" name="password" >

            <input type="submit" value="Login">
        </form>
    </div>
    <div id="reg-cont">
        <form action="/register" method="post">
            <label for="username">Username: </label>
            <input type="text" name="username" >
            <label for="password">Password: </label>
            <input type="password" name="password" >
            <label for="password">Password: </label>
            <input type="password" name="password2">
            <label for="email">Email: </label>
            <input type="email" name="email" >

            <input type="submit" value="Register">
        </form>
    </div>
</div>
</body>