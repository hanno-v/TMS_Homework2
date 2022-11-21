package main.webapp.pojo;

public enum Role {


    STUDENT("Student"),
    TEACHER("Teacher"),
    ADMIN("Admin");


    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
