<%--<%@ page session="true" %>--%>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h2>Welcome Page</h2>
<%
    HttpSession session = request.getSession(false);
    if (session != null) {
        String username = (String) session.getAttribute("username");
        if (username != null) {
            out.print("Hello, " + username + "! Welcome to your dashboard.");
        } else {
            response.sendRedirect("login.jsp");
        }
    } else {
        response.sendRedirect("login.jsp");
    }
%>
<br><br>
<form action="logout" method="post">
    <input type="submit" value="Logout">
</form>
</body>
</html>