<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 22-Feb-22
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="customers?action=customers">List All Customers</a>
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
                <h2>Add New Customer</h2>
            </caption>
            <tr>
                <th>Code Customer:</th>
                <td>
                    <input type="text" name="code" id="code" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Type Id Customer:</th>
                <td>
                    <input type="text" name="typeid" id="typeid" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Birthday Customer:</th>
                <td>
                    <input type="text" name="birthday" id="birthday" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Gender Customer:</th>
                <td>
                    <select type="text" name="gender" id="gender">
                        <option value="">Chọn giới tính...</option>
                        <option value="true">Nam</option>
                        <option value=false">Nữ</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Id Card Customer:</th>
                <td>
                    <input type="text" name="idcard" id="idcard" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Phone Customer:</th>
                <td>
                    <input type="text" name="phone" id="phone" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Email Customer:</th>
                <td>
                    <input type="text" name="email" id="email" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Address Customer:</th>
                <td>
                    <input type="text" name="address" id="address" size="15"/>
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
