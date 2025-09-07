<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="iuh.se.tuan03.entity.Student" %>

<html>
<head>
    <title>Student Registration Result</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        table { border-collapse: collapse; width: 50%; }
        th, td { border: 1px solid #ccc; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>
<h2>Registration Details</h2>

<%
    Student student = (Student) request.getAttribute("student");
    if (student == null) {
%>
<p>No student data found!</p>
<%
} else {
%>

<table>
    <tr>
        <th>First Name</th>
        <td><%= student.getFirstName() %></td>
    </tr>
    <tr>
        <th>Last Name</th>
        <td><%= student.getLastName() %></td>
    </tr>
    <tr>
        <th>Date of Birth</th>
        <td><%= student.getDateOfBirth() != null ? student.getDateOfBirth() : "Not provided" %></td>
    </tr>
    <tr>
        <th>Email</th>
        <td><%= student.getEmail() %></td>
    </tr>
    <tr>
        <th>Mobile Number</th>
        <td><%= student.getPhone() %></td>
    </tr>
    <tr>
        <th>Gender</th>
        <td><%= student.getGender() %></td>
    </tr>
    <tr>
        <th>Address</th>
        <td><%= student.getAddress() %></td>
    </tr>
    <tr>
        <th>City</th>
        <td><%= student.getCity() %></td>
    </tr>
    <tr>
        <th>Pin Code</th>
        <td><%= student.getPincode() %></td>
    </tr>
    <tr>
        <th>State</th>
        <td><%= student.getState() %></td>
    </tr>
    <tr>
        <th>Country</th>
        <td><%= student.getCountry() %></td>
    </tr>
    <tr>
        <th>Hobbies</th>
        <td><%= student.getHobbies() != null && !student.getHobbies().isEmpty() ? student.getHobbies() : "None" %></td>
    </tr>
    <tr>
        <th>Course Applied</th>
        <td><%= student.getCourseApplies() %></td>
    </tr>
</table>

<%
    }
%>
</body>
</html>
