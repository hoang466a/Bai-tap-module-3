<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 18-Feb-22
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getNameProduct()}$</td>
    </tr>
    <tr>
        <td>Price Product: </td>: </td>
        <td>${requestScope["product"].getPriceProduct()}$</td>
    </tr>
    <tr>
        <td>Information Product: </td>
        <td>${requestScope["product"].getInformation()}</td>
    </tr>
    <tr>
        <td>Producer: </td>
        <td>${requestScope["product"].getProducer()}</td>
    </tr>
</table>
</body>
</html>