package org.example.service.impl;

import org.example.entity.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.example.service.request.UserRequest;
import org.example.service.response.UserResponse;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void add(UserRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDateOfBirth(request.getDateOfBirth());
        user.setNationalIdentity(request.getNationalIdentity());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        userRepository.add(user);
    }

    @Override
    public void update(int id, UserRequest request) {
        User user = userRepository.getById(id);
        if (user != null) {
            user.setUsername(request.getUsername());
            user.setFirstName(request.getFirstName());
            user.setLastName(request.getLastName());
            user.setDateOfBirth(request.getDateOfBirth());
            user.setNationalIdentity(request.getNationalIdentity());
            user.setEmail(request.getEmail());
            user.setPassword(request.getPassword());

            userRepository.update(user);
        }
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public UserResponse getById(int id) {
        User user = userRepository.getById(id);
        return mapToUserResponse(user);
    }

    @Override
    public List<UserResponse> getAll() {
        List<User> users = userRepository.getList();
        List<UserResponse> responses = new ArrayList<>();
        for (User user : users) {
            responses.add(mapToUserResponse(user));
        }
        return responses;
    }

    private UserResponse mapToUserResponse(User user) {
        if (user == null) return null;
        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setUsername(user.getUsername());
        response.setFirstName(user.getFirstName());
        response.setLastName(user.getLastName());
        response.setDateOfBirth(user.getDateOfBirth());
        response.setNationalIdentity(user.getNationalIdentity());
        response.setEmail(user.getEmail());
        return response;
    }
}
