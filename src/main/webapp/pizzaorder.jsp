<%--
  Created by IntelliJ IDEA.
  User: ryanphillips
  Date: 1/21/21
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form action="/pizzaorder" method="POST">
    <div class="form-group">
        <label for="crust">Enter your crust:</label>
        <input id="crust" name="crust" class="form-control" type="text">
    </div>
    <div class="form-group">
        <label for="sauce">Whats your sauce?</label>
        <input id="sauce" name="sauce" class="form-control">
    </div>
    <div class="form-group">
        <label for="size">Choose your size:</label>
        <select id="size" name="size">
            <option value="Sm">Small</option>
            <option value="Md">Medium</option>
            <option value="Lg">Large</option>
            <option value="Xlg">Extra Large</option>
        </select>
    </div>
    <div>
        <legend>Toppings Time!</legend>
        <input type="checkbox" name="toppings" value="pepperoni">Pepperoni<br>
        <input type="checkbox" name="toppings" value="extra_cheese">Extra Cheese<br>
        <input type="checkbox" name="toppings" value="sausage">Sausage<br>
        <input type="checkbox" name="toppings" value="chicken">Chicken<br>
        <input type="checkbox" name="toppings" value="bbq_sauce">BBQ_Sauce<br>
        <input type="checkbox" name="toppings" value="anchovies">Anchovies<br>
    </div>
    <div class="form-group">
        <label for="address">Where we bringing this badboy?</label>
        <input type="text" id="address" name="address">
   </div>

    <input type="submit" class="btn btn-primary btn-block" value="Order">
</form>
</body>
</html>
