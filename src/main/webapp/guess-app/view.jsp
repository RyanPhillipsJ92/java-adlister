<%--
  Created by IntelliJ IDEA.
  User: ryanphillips
  Date: 1/21/21
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Results</title>
</head>
<body>
<c:choose>
    <c:when test="${url.equals('/incorrect')}">
        <h1>You are incorrect</h1>
    </c:when>
    <c:otherwise>
        <h1>You are correct</h1>
    </c:otherwise>
</c:choose>
</body>
</html>
