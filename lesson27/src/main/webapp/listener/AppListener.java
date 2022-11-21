package main.webapp.listener;

import main.webapp.utils.Constants;
import main.webapp.pojo.Role;
import main.webapp.pojo.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class AppListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute(Constants.USERS_ATTRIBUTE, init());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        destroy((List<User>) servletContext.getAttribute(Constants.USERS_ATTRIBUTE));
    }


    private List<User> init() {
        List<User> users = new ArrayList<>();
        users.add(new User("FName1", "LName1", "C1", Role.STUDENT));
        users.add(new User("FName2", "LName2", "C2", Role.TEACHER));
        users.add(new User("FName3", "LName3", "C3", Role.STUDENT));
        users.add(new User("FName4", "LName4", null, Role.ADMIN));

        return users;
    }


    private void destroy(List<User> users) {
        users.clear();
    }

}
