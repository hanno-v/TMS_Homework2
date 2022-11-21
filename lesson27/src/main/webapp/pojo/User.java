package main.webapp.pojo;

import main.webapp.pojo.Role;
import main.webapp.utils.IdentityUtil;

import java.io.Serializable;

public class User implements Serializable {


    private static final long serialVersionUID = 3670608757161174368L;

    Long id;
    String firstName;
    String lastName;
    String course;
    Role role;

    public User(String firstName, String lastName, String course, Role role) {
        this.id = IdentityUtil.getId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.role = role;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
