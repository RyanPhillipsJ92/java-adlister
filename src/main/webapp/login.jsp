<%--
  Created by IntelliJ IDEA.
  User: ryanphillips
  Date: 1/20/21
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="login.jsp" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username">
        <label for="user-id"></label>
        <input type="password" id="user-id" name="password">
        <button type="submit">Go There</button>
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("post")){
            if (request.getParameter("username").equalsIgnoreCase("admin") &&
            request.getParameter("password").equals("password")) {
               response.sendRedirect("profile.jsp");
            }
        }
    %>
</body>
</html>
