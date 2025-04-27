package org.example.repository;

import org.example.entity.Instructor;
import java.util.List;

public interface InstructorRepository {
    void add(Instructor instructor);
    void update(Instructor instructor);
    void delete(int id);
    Instructor getById(int id);
    List<Instructor> getList();
}
