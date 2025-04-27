package org.example.repository;

import org.example.entity.Applicant;
import java.util.List;

public interface ApplicantRepository {
    void add(Applicant applicant);
    void update(Applicant applicant);
    void delete(int id);
    Applicant getById(int id);
    List<Applicant> getList();
}
