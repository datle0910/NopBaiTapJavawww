<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 9/7/2025
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="registration-form" name="formDangKy" method="GET">
        <div>
            <label>First name:</label>
            <input type="text" id="firstname" name="firstname">
            <span>max 30 charater a-z and A-Z</span>
        </div>
        <div>
            <label>Last name:</label>
            <input type="text" id="lastname" name="lastname">
            <span>max 30 charater a-z and A-Z</span>
        </div>
        <div>
            <label>Date of birth:</label>
            <input type="date" id="dateofbirth" name="dateofbirth">
        </div>
        <div>
            <label>Email:</label>
            <input type="text" id="email" name="email">
        </div>
        <div>
            <label>Mobile num:</label>
            <input type="text" id="mobilenum" name="mobilenum">
        </div>
        <div>
            <label>Gender:</label>
            <input type="radio" id="radioGendermale" name="radioGender" value="male">male
            <input type="radio" id="radioGenderfemale" name="radioGender" value="female">female
        </div>
        <div>
            <label>Adress:</label>
            <input type="text" id="address" name="address">
        </div>
        <div>
            <label>City:</label>
            <input type="text" id="city" name="city">
            <span>max 30 charater a-z and A-Z</span>
        </div>
        <div>
            <label>Pin code:</label>
            <input type="text" id="pincode" name="pincode">
            <span>6 digist number</span>
        </div>
        <div>
            <label>state:</label>
            <input type="text" id="state" name="state">
            <span>max 30 charater a-z and A-Z</span>
        </div>
        <div>
            <label>Country:</label>
            <input type="text" id="country" name="country">
        </div>
        <div>
            <label>Hobies:</label>
            <input type="checkbox" id="drawing" name="hobies" value="drawing">Drawing
            <input type="checkbox" id="dancing" name="hobies" value="dancing">Dancing
            <input type="checkbox" id="order" name="hobies" value="order">Order

        </div>
        <table>
            <thead>
            <tr>
                <th>Sl.No.</th>
                <th>Examination</th>
                <th>Board</th>
                <th>Percentage</th>
                <th>Year of Passing</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>Class X</td>
                <td><input type="text" name="board1"  /></td>
                <td><input type="text" name="percentage1"  title="Up to 2 decimal places"/></td>
                <td><input type="text" name="year1" title="4 digit year"/></td>
            </tr>
            <tr>
                <td>2</td>
                <td>Class XII</td>
                <td><input type="text" name="board2"  /></td>
                <td><input type="text" name="percentage2" title="Up to 2 decimal places"/></td>
                <td><input type="text" name="year2"  title="4 digit year"/></td>
            </tr>
            <tr>
                <td>3</td>
                <td>Graduation</td>
                <td><input type="text" name="board3"  /></td>
                <td><input type="text" name="percentage3"  title="Up to 2 decimal places"/></td>
                <td><input type="text" name="year3"  title="4 digit year"/></td>
            </tr>
            <tr>
                <td>4</td>
                <td>Masters</td>
                <td><input type="text" name="board4"  /></td>
                <td><input type="text" name="percentage4"  title="Up to 2 decimal places"/></td>
                <td><input type="text" name="year4"  title="4 digit year"/></td>
            </tr>
            </tbody>
        </table>
        <div>
            <label>Course aplies for::</label>
            <input type="radio" id="bca" name="aplies" value="bca">Bca
            <input type="radio" id="sc" name="aplies" value="sc">sc
            <input type="radio" id="ba" name="aplies" value="ba">Ba
        </div>
        <div>
            <input type="submit" id="submit" name="submit" value="submit">
            <input type="reset" id="reset" name="reset" value="reset">
        </div>
    </form>
</body>
</html>
