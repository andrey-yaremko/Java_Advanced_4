package com.example.LessonAdvance4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet", value = "/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;
     private UserService userService = UserService.getUserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(firstName.length()<1 || lastName.length() <1 || email.length() <5 || password.length()<6 ) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }

        userService.saveUser(new UserAccount(firstName,lastName,email,password));
        request.setAttribute("userEmail", email);
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}

