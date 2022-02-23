<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 23-Feb-22
  Time: 3:17 PM
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
        <a href="customers?action=">List All Users</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Edit Customer

                </h2>
            </caption>
            <c:if test="${customer != null}">
                <input type="hidden" name="id" value="${customer.idCustomer}"/>
            </c:if>
            <tr>
                <th>Name Customer:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="${customer.nameCustomer}"
                    />
                </td>
            </tr>
            <tr>
                <th>Code Customer:</th>
                <td>
                    <input type="text" name="code" size="45"
                           value="${customer.codeCustomer}"
                    />
                </td>
            </tr>
            <tr>
                <th>Birthday Customer:</th>
                <td>
                    <input type="text" name="birthday" size="45"
                           value="${customer.birthdayCustomer}"
                    />
                </td>
            </tr>
            <tr>
                <th>Gender Customer:</th>
                <td>
                    <select type="text" name="gender" id="gender">
                        <option value="${customer.genderCustomer}">Chọn giới tính...</option>
                        <option value="true">Nam</option>
                        <option value="false">Nữ</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Id Card Customer:</th>
                <td>
                    <input type="text" name="idcard" size="45"
                           value="${customer.idCardCustomer}"
                    />
                </td>
            </tr>
            <tr>
                <th>Phone Customer:</th>
                <td>
                    <input type="text" name="phone" size="45"
                           value="${customer.phoneCustomer}"
                    />
                </td>
            </tr>
            <tr>
                <th>Email Customer:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="${customer.emailCustomer}"
                    />
                </td>
            </tr>
            <tr>
                <th>Address Customer:</th>
                <td>
                    <input type="text" name="address" size="45"
                           value="${customer.addressCustomer}"
                    />
                </td>
            </tr>
            <tr>
            <tr>
                <th>Customer Type:</th>
                <td>
                    <select id="ok" name="idtypecustomer">
                        <c:forEach var="type" items="${customerTypeList}">
                            <option value="${type.idTypeCustomer}">${type.nameTypeCustomer}

                            </option>
                        </c:forEach>
                    </select>
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
