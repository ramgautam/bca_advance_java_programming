package org.example.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetCookieServlet")
public class SetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create a cookie
        Cookie userCookie = new Cookie("username", "JohnDoe");

        // Set cookie expiry time (in seconds)
        userCookie.setMaxAge(24 * 60 * 60); // 1 day

        // Add cookie to the response
        response.addCookie(userCookie);

        // Redirect to another page or JSP
        response.sendRedirect("welcome.jsp");
    }
}
