package org.example.entity;

public class Instructor extends User {
    private String companyName;

    public Instructor() {
    }

    public Instructor(int id, String username, String firstName, String lastName,
                      java.time.LocalDate dateOfBirth, String nationalIdentity, String email, String password,
                      String companyName) {
        super(id, username, firstName, lastName, dateOfBirth, nationalIdentity, email, password);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

