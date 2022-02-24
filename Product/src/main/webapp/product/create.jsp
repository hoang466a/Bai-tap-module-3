<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 24-Feb-22
  Time: 9:05 AM
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
        <a href="products?action=products">List All Products</a>
    </h2>
    <p>
        <c:if test='${requestScope["message"] != null}'>
            <span class="message">${requestScope["message"]}</span>
        </c:if>
    </p>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Product</h2>
            </caption>
            <tr>
                <th>Name Product:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Price Product:</th>
                <td>
                    <input type="text" name="price" id="price" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Quantity Product:</th>
                <td>
                    <input type="text" name="quantity" id="quantity" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Color Product:</th>
                <td>
                    <input type="text" name="color" id="color" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Description Product:</th>
                <td>
                    <input type="text" name="des" id="des" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Category Product:</th>
                <td>
                    <input type="text" name="cate" id="cate" size="15"/>
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
