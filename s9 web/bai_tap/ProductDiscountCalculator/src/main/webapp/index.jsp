<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 15-Feb-22
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<br>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form action="/calculator" method="post">
    <label>Product Description</label></br>
    <input type="text" name="product" placeholder="PRODUCT"></br>
    <label>List Price</label></br>
    <input type="text" name="price" placeholder="PRICE"></br>
    <label>Discount Percent</label></br>
    <input type="text" name="discount" placeholder="DISCOUNT"></br>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>

  </body>
</html>
