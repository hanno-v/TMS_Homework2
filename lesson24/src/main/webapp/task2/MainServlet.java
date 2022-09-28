package main.webapp.task2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet("/task2/formresult2")
public class MainServlet extends HttpServlet {


    HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        ArrayList<String> values = new ArrayList<>();


        if (req.getParameter("type").equals("register")) {

            if (!hashMap.containsKey(req.getParameter("email1"))) {

                values.add(req.getParameter("password1"));
                if (req.getParameter("checkbox1") != null) {
                    values.add("true");
                } else {
                    values.add("false");
                }


                hashMap.put(req.getParameter("email1"), values);
                writer.println("Successful registration");
                writer.println(hashMap.size() + " users registered");
            } else {
                writer.println("This email has been used");
            }


        } else if (req.getParameter("type").equals("login")) {

            if (hashMap.containsKey(req.getParameter("email1"))) {
                if (hashMap.get(req.getParameter("email1")).contains(req.getParameter("password1"))) {

                    HttpSession httpSession = req.getSession();
                    httpSession.setAttribute("login", "true");
                    writer.println("Successful login");
                } else {
                    writer.println("Wrong password");
                }
            } else {
                writer.println("Wrong email");
            }

        } else {
            writer.println("Try to login or register");
        }


    }
}