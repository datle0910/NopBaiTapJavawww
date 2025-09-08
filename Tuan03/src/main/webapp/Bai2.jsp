<%--
  Created by IntelliJ IDEA.
  User: datnh
  Date: 9/8/2025
  Time: 11:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>User registration form</h1>
    <form action="signup-bai2" method="post">
        <div>
            <input type="text" id="firstname" name="firstname" placeholder="Firstname">
            <input type="text" id="lastname" name="lastname" placeholder="Lastname">
        </div>
        <div>
            <input type="email" id="email" name="email" placeholder="Your email">
        </div>
        <div>
            <input type="email" id="reemail" name="reemail" placeholder="Re-enter email">
        </div>
        <div>
            <input type="password" id="password" name="password" placeholder="Your password">
        </div>
        <div>
            <input type="date" id="birthday" name="birthday" placeholder="Your birthday">
        </div>
        <div>
            <input type="radio" id="malegender" name="gender" value="male">Male
            <input type="radio" id="femalegender" name="gender" value="female">Female
        </div>
        <div>
            <input type="submit" id="submit" name="signup">
        </div>
    </form>
</body>
</html>
