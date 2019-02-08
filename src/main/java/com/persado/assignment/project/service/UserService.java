package com.persado.assignment.project.service;

import com.persado.assignment.project.domain.User;
import com.persado.assignment.project.models.UserModel;

import java.util.List;

public interface UserService {
    UserModel create(UserModel userModel);
    List<User> findAll();
    void delete(Long id);
}
