<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 24-Feb-22
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Management Application</title>
</head>
<body>
<center>
    <h1>Product Management</h1>
    <h2>
        <a href="/products?action=create" style="float: left">Add New Product</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Products</h2></caption>
        <tr>
            <th>ID Product</th>
            <th>Name Product</th>
            <th>Price Product</th>
            <th>Quantity Product</th>
            <th>Color Product</th>
            <th>Description Product</th>
            <th>Category Product</th>
        </tr>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td>${product.idProduct}</td>
                <td>${product.nameProduct}</td>
                <td>${product.priceProduct}</td>
                <td>${product.quantityProduct}</td>
                <td>${product.colorProduct}</td>
                <td>${product.desProduct}</td>
                <td>${product.cateProduct}</td>

                <td>
                    <a href="/products?action=edit&id=${product.idProduct}">Edit</a>
                    <a href="/products ?action=delete&id=${product.idProduct}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
