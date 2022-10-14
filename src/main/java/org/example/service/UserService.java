package org.example.service;

import org.example.domain.User;

import java.util.List;

public interface UserService {
    int save(User user);
    int update(User user);
    int delete(Integer id);
    User getById(Integer id);
    List<User> getAll();
}
