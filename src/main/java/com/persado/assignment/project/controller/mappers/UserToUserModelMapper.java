package com.persado.assignment.project.controller.mappers;

import com.persado.assignment.project.domain.User;
import com.persado.assignment.project.models.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserToUserModelMapper {
        public UserModel mapToUserModel(User user) {
            UserModel userModel = new UserModel();
            userModel.setFirstName(user.getFirstName());
            userModel.setLastName(user.getLastName());
            userModel.setAddress(user.getAddress());
            return userModel;
        }

}
