<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
  <title>Multi Language JSP</title>
</head>
<body>
<%
  String lang = request.getParameter("lang");
  if (lang == null) {
    lang = "en";
  }
%>

<fmt:setLocale value="<%=lang%>" scope="session"/>
<fmt:setBundle basename="messages" />

<!-- Form chọn ngôn ngữ -->
<form action="Language.jsp" method="get">
  <fmt:message key="label.language"/>:
  <input type="radio" name="lang" value="vi" <%= "vi".equals(lang) ? "checked" : "" %> >
  <fmt:message key="lang.vietnamese"/>
  <input type="radio" name="lang" value="en" <%= "en".equals(lang) ? "checked" : "" %> >
  <fmt:message key="lang.english"/>
  <input type="submit" value="<fmt:message key='button.choose'/>">
</form>

<hr/>

<form action="result-form.jsp" method="post">
  <label><fmt:message key="label.username"/></label>
  <input type="text" name="username"><br><br>

  <label><fmt:message key="label.password"/></label>
  <input type="password" name="password"><br><br>

  <input type="submit" value="<fmt:message key='button.login'/>">
</form>
</body>
</html>
