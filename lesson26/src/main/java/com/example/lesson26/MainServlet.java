package com.example.lesson26;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/form")
public class MainServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        if (req.getParameter("fname").equals("") || req.getParameter("lname").equals("") ||
                req.getParameter("city").equals("") || req.getParameter("info").equals("")) {
            req.getRequestDispatcher("save.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("data.jsp").forward(req, resp);
        }


    }

}
