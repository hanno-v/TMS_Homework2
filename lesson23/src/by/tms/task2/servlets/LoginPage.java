package by.tms.task2.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        writer.println("<html>" +
                "<body>" +
                "<h3>Enter login and password:</h3>" +
                "<form action=\"login\" method=\"POST\">" +
                "login <input name=\"name\"><br>" +
                "password <input name=\"password\"><br>" +
                "<input type=\"submit\" value=\"Submit\">" +
                "</form>" +
                "</body" +
                "</html>");

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();


        String name = req.getParameter("name");
        String password = req.getParameter("password");

        if ((name.equals("user1") && password.equals("pass1")) ||
                (name.equals("user2") && password.equals("pass2")) ||
                (name.equals("user3") && password.equals("pass3"))) {

            HttpSession session = req.getSession();
            session.setAttribute("login", "true");

            String path = "/task2/securemain";
            resp.sendRedirect(path);

        } else {
            String path = "/redirectpage";
            resp.sendRedirect(path);
        }

    }


}
