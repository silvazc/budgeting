<%--
  Created by IntelliJ IDEA.
  User: Carlos Silva
  Date: 6/24/2020
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
    <form action="addUser">
        <input type="text" name="uid"><br>
        <input type="text" name="userName"><br>
        <input type="submit"><br>
    </form>
    <hr>
    <form action="newReport" method="get">
        <input type="text" name="spent">How much did you spend?<br>
        <input type="text" name="category">Category<br>
        <input type="text" name="subcategory">Subcategory<br>
        <%-- Not everything needs to be a text field, but i just dont know how to do other stuff yet--%>
        <input type="text" name="paymentType">Payment Type<br>
        <input type="submit"><br>
    </form>
</body>
</html>
