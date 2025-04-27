package org.example.service;

import org.example.service.request.UserRequest;
import org.example.service.response.UserResponse;
import java.util.List;

public interface UserService {
    void add(UserRequest request);
    void update(int id, UserRequest request);
    void delete(int id);
    UserResponse getById(int id);
    List<UserResponse> getAll();
}
