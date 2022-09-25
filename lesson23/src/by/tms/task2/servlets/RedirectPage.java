package by.tms.task2.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirectpage")
public class RedirectPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.println("<html>" +
                "<body>" +
                "<h3>Wrong name or password, try again:</h3>" +
                "<form action=\"redirectpage\" method=\"POST\">" +
                "<a href=\"/login\">login</a> \n" +
                "<br></br>" +
                "</form>" +
                "</body" +
                "</html>");
    }
}
