package org.example.repository;

import org.example.entity.Employee;
import java.util.List;

public interface EmployeeRepository {
    void add(Employee employee);
    void update(Employee employee);
    void delete(int id);
    Employee getById(int id);
    List<Employee> getList();
}
