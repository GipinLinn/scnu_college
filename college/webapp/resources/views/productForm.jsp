<%--  Created by IntelliJ IDEA.  User: gipin  Date: 2017/1/6  Time: 10:12  To change this template use File | Settings | File Templates.--%><%@ page contentType="text/html;charset=UTF-8" language="java" %><html><head>    <title>产品信息</title></head><body> <form action="save.do" method="post">     <fieldset>         <legend>Add a product</legend>         <label for="name">Product Name:</label>         <input type="text" name="name" id="name" tabindex="1"/>         <label for="description">Desctiption:</label>         <input type="text" id="description" name="description" tabindex="2">         <label for="price">Price:</label>         <input type="text" id="price" name="price" tabindex="3">         <input type="reset" id="reset" name="reset"/>         <input type="submit" id="submit" name="submit"/>     </fieldset> </form></body></html>