<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 16-Feb-22
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CALCULATOR</title>
  </head>
  <body>
  <h2>Simple Calculator</h2>
  <form method="post" action="/calculate">
    <table>
    <h4>Calculator</h4>
      <tr>
        <td><label>First operand:</label></td>
        <td><input type="text" name ="first-operand" placeholder="enter first operand"></td>
      </tr>

      <tr>
        <td><label>Operator:</label></td>
        <td><select name="operator">
        <option value="+">addition (+)</option>
        <option value="-">subtraction (-)</option>
        <option value="*">multiplication (*)</option>
        <option value="/">division (/)</option>
      </select></tr>

      <tr>
        <td><label>Second operand:</label></td>
        <td><input type="text" name ="second-operand" placeholder="enter second operand"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Calculate"></td>
      </tr>
    </table>
  </form>
  </body>
</html>
