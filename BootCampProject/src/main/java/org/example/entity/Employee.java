package org.example.entity;

public class Employee extends User {
    private String position;

    public Employee() {
    }

    public Employee(int id, String username, String firstName, String lastName,
                    java.time.LocalDate dateOfBirth, String nationalIdentity, String email, String password,
                    String position) {
        super(id, username, firstName, lastName, dateOfBirth, nationalIdentity, email, password);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
