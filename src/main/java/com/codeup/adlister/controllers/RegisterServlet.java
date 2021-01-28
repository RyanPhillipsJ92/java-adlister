package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODO: show the registration form
        if (request.getSession().getAttribute("user") != null &&
                request.getSession().getAttribute("email") != null &&
                request.getSession().getAttribute("password") != null
        )  {
            request.setAttribute("user", request.getSession().getAttribute("user"));
            request.setAttribute("email", request.getSession().getAttribute("email"));
            request.setAttribute("password", request.getSession().getAttribute("password"));

            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        boolean checkGood = username.isEmpty() || password.isEmpty() || email.isEmpty();
        if (!checkGood){
            User user = new User(username, email, password);
            Long newUserId = DaoFactory.getUsersDao().insert(user);
            user.setId(newUserId);
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
            return;
        }else {
            response.sendRedirect("/register");
        }

    }
}
