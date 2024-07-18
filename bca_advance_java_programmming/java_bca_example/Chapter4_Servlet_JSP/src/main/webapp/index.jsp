<%--
  Created by IntelliJ IDEA.
  User: ramgautam
  Date: 09/07/2024
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello, World!</h2>
<form action="hello" method="post">
    <input type="text" name="name" placeholder="Enter your name"/>
    <input type="button" value="Submit" onclick=""/>
    <LI>Current time: <%= new java.util.Date() %>
    <% for (int i=0;i<10 ;i++){ %>
        <LI> value from  loop <%= i%></LI>
    <%}%>
    <LI>Your hostname: <%= request.getRemoteHost() %>

</form>
</body>
</html>
