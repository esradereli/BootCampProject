package org.example.repository;

import org.example.entity.User;
import java.util.List;

public interface UserRepository {
    void add(User user);
    void update(User user);
    void delete(int id);
    User getById(int id);
    List<User> getList();
}
