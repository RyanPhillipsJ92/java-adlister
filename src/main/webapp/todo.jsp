<%--
  Created by IntelliJ IDEA.
  User: ryanphillips
  Date: 1/19/21
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("isAdmin", true); %>
<% request.setAttribute("myTasks", new String[] {"Todo 1", "Todo 2", "Todo 3"}); %>
<html>
<head>
    <title>To Do List</title>
</head>
<body>
<h1>Here is your To Do List:</h1>
<ul>
    <li>
        <%= request.getParameter("item") %>
    </li>
</ul>
<p><%= request.getMethod() %></p>
</body>
</html>
