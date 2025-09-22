<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fongo HomePhone</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/style.css">
</head>
<body>
<header style="text-align:center;padding:8px 0">
    <img src="${pageContext.request.contextPath}/assets/logo.png" alt="logo" height="60"/>
    <nav style="margin-top:8px">
        <a href="${pageContext.request.contextPath}/ncc">Danh sách sản phẩm</a> |
        <a href="${pageContext.request.contextPath}/phone/new">Thêm mới sản phẩm</a> |
        <a href="${pageContext.request.contextPath}/ncc">Chức năng quản lý</a>
    </nav>
</header>
<hr/>
<div style="min-height:400px">
    <jsp:doBody/>
</div>
<footer style="text-align:center;padding:12px 0">
    Họ tên sinh viên – Mã sinh viên – Lớp
</footer>
</body>
</html>
