package org.example.service;

import org.example.service.request.InstructorRequest;
import org.example.service.response.InstructorResponse;
import java.util.List;

public interface InstructorService {
    void add(InstructorRequest request);
    void update(int id, InstructorRequest request);
    void delete(int id);
    InstructorResponse getById(int id);
    List<InstructorResponse> getAll();
}
