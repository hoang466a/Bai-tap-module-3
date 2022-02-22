<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 22-Feb-22
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Management Application</title>
</head>
<body>
<center>
    <h1>Customer Management</h1>
    <h2>
        <a href="/users?action=create">Add New Customer</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Customers</h2></caption>
        <tr>
            <th>ID Customer</th>
            <th>Type Id Customer</th>
            <th>Customer Name</th>
            <th>Customer Birthday</th>
            <th>Customer Gender</th>
            <th>Customer Id Card</th>
            <th>Customer Phone</th>
            <th>Customer Email</th>
            <th>Customer Address</th>
            <th>Customer Type Name</th>
        </tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td><c:out value="${customer.idCustomer}"/></td>
                <td><c:out value="${customer.typeIdCustomer}"/></td>
                <td><c:out value="${customer.nameCustomer}"/></td>
                <td><c:out value="${customer.birthdayCustomer}"/></td>
                <td><c:out value="${customer.genderCustomer ? 'Nam':'Nữ'}"/></td>
                <td><c:out value="${customer.idCardCustomer}"/></td>
                <td><c:out value="${customer.phoneCustomer}"/></td>
                <td><c:out value="${customer.emailCustomer}"/></td>
                <td><c:out value="${customer.addressCustomer}"/></td>
                <td><c:out value="${customer.typeNameCustomer}"/></td>
                <td>
                    <a href="/users?action=edit&id=${customer.idCustomer}">Edit</a>
                    <a href="/users?action=delete&id=${customer.idCustomer}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>