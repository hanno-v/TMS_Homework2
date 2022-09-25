package by.tms.task2.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/task2/securemain")
public class SecurePageMain extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        writer.println("<html>" +
                "<body>" +
                "<h3>Great job, your name and password are correct</h3>" +
                "<form action=\"securemain\" method=\"POST\">" +
                "<a href=\"/task2/sec1\">secure page1</a>" +
                "<br></br>" +
                "<a href=\"/task2/sec2\">secure page2</a> \n" +
                "<br></br>" +
                "</form>" +
                "</body" +
                "</html>");

    }
    

}
