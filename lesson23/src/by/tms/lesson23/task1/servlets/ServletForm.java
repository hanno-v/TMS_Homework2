package by.tms.lesson23.task1.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/uploadstartpage")
public class ServletForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>" +
                "<body>" +
                "<h1>Choose file to upload</h1>" +
                "<form action=\"/upload\" method=\"POST\" enctype=\"multipart/form-data\">" +
                "<input type=\"file\" name=\"file\"><br>" +
                "<input type=\"submit\" value=\"Upload\">" +
                "</form>" +
                "</body" +
                "</html>");
    }
}
