<%@ page import="java.util.*, vn.iuh.dat.bai1.Entity.User" %>
<h2>Danh Sach Tai Khoan</h2>
<table border="1">
    <tr><th>First Name</th><th>Last Name</th><th>Email</th><th>Gender</th><th>Birthday</th></tr>
    <%
        List<User> users = (List<User>) request.getAttribute("users");
        for(User u : users){
    %>
    <tr>
        <td><%= u.getFirstName() %></td>
        <td><%= u.getLastName() %></td>
        <td><%= u.getEmail() %></td>
        <td><%= u.getGender() %></td>
        <td><%= u.getBirthday() %></td>
    </tr>
    <% } %>
</table>
