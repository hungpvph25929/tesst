<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 4/6/2023
  Time: 8:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<header><label style="font-size: 20px">Đăng nhập</label></header>
<section>
    <form method="post" action="/LoginServlet">

        <div class="container">
            <label><b>Username</b></label><br>
            <input type="text" placeholder="Enter Username" name="account">
            <br>
            <label><b>Password</b></label><br>
            <input type="password" placeholder="Enter Password" name="pass">
            <br>
            <p style="color: red">${message}</p>
            <button type="submit">Login</button>
        </div>
    </form>
</section>
<footer>Footer: FPT Polytechnic</footer>
</body>
</html>
