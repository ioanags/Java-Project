package com.persado.assignment.project.service;

import com.persado.assignment.project.controller.mappers.UserToUserModelMapper;
import com.persado.assignment.project.domain.User;
import com.persado.assignment.project.models.UserModel;
import com.persado.assignment.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserToUserModelMapper userMapper;

    @Override
    public UserModel create(UserModel userModel) {
        User user = new User(userModel.getFirstName(),userModel.getLastName(),userModel.getAddress() );
        User savedUser = userRepository.save(user);
        return userMapper.mapToUserModel(savedUser);
    }
}
