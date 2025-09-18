<%--
  Created by IntelliJ IDEA.
  User: datnh
  Date: 9/18/2025
  Time: 11:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="register" method="post">
        First Name: <input type="text" name="firstName" /><br/>
        Last Name: <input type="text" name="lastName" /><br/>
        Email: <input type="email" name="email" /><br/>
        Password: <input type="password" name="password" /><br/>
        Birthday: <input type="date" name="birthday" /><br/>
        Gender:
        <input type="radio" name="gender" value="Male" />Male
        <input type="radio" name="gender" value="Female" />Female
        <br/>
        <input type="submit" value="Sign Up" />
    </form>

</body>
</html>
