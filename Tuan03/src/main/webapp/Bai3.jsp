<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Result</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
%>
<h2>Thông tin bạn đã nhập:</h2>
<p>Username: <%= username %></p>
<p>Password: <%= password %></p>
</body>
</html>
