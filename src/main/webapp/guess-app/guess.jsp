<%--
  Created by IntelliJ IDEA.
  User: ryanphillips
  Date: 1/21/21
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Number Guess </title>
</head>
<body>

    <form action="/guess" method="POST">
        <div class="form-group">
            <label for="userGuess">Guess a number between 1-3</label>
            <input id="userGuess" name="userGuess" class="form-control" type="text">
            <input type="submit" class="btn btn-primary btn-block" value="Guess">
        </div>
    </form>

</body>
</html>
