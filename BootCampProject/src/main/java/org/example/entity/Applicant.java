package org.example.entity;

public class Applicant extends User {
    private String about;

    public Applicant() {
    }

    public Applicant(int id, String username, String firstName, String lastName,
                     java.time.LocalDate dateOfBirth, String nationalIdentity, String email, String password,
                     String about) {
        super(id, username, firstName, lastName, dateOfBirth, nationalIdentity, email, password);
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
