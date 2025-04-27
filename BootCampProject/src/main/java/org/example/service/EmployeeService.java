package org.example.service;

import org.example.service.request.EmployeeRequest;
import org.example.service.response.EmployeeResponse;
import java.util.List;

public interface EmployeeService {
    void add(EmployeeRequest request);
    void update(int id, EmployeeRequest request);
    void delete(int id);
    EmployeeResponse getById(int id);
    List<EmployeeResponse> getAll();
}
