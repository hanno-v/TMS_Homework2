package main.webapp.task1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/task1/formresult")
public class MainServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        writer.println("Here is your submitted form:" + System.lineSeparator() +
                "Name: " + req.getParameter("name") + System.lineSeparator() +
                "Selected course: " + req.getParameter("courses") + System.lineSeparator() +
                "Info: " + req.getParameter("info") + System.lineSeparator() +
                "Secret word: " + req.getParameter("password1")
        );


    }
}
