<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 16-Feb-22
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>DANH SÁCH KHÁCH HÀNG</h2>
<table border="1">
<tr>
    <th>Tên</th>
    <th>Ngày sinh</th>
    <th>Địa chỉ</th>
    <th>Ảnh</th>
</tr>

<c:forEach var="customer" items="${list}">
<tr>
    <td><c:out value="${customer.name}"></c:out> </td>
    <td><c:out value="${customer.date}"></c:out> </td>
    <td><c:out value="${customer.address}"></c:out> </td>
    <td><img src="${customer.img}" alt="Italian Trulli"> </td>
</tr>
</c:forEach>
</table>
</body>
</html>
