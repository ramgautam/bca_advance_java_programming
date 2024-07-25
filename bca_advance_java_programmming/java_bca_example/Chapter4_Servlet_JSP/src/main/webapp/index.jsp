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
<%! String name="Java Class as a global variable "; %>
<h2>Hello, World!</h2>
<%-- This is a JSP comment  --%>
<form action="hello" method="post">
    <input type="text" name="name" placeholder="Enter your name"/>
    <input type="submit" value="Submit" onclick=""/>
    <LI>Current time: <%= new java.util.Date() %>
    <% for (int i=0;i<10 ;i++){ %>
        <LI> value from  loop <%= i %> And variable value: <%= name %></LI>
    <%}%>
    <table>hello</table>
    <LI>Your hostname: <%= request.getRemoteHost() %>

</form>
</body>
</html>
