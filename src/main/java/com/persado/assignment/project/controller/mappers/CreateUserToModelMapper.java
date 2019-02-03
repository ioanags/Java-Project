package com.persado.assignment.project.controller.mappers;

import com.persado.assignment.project.domain.User;
import com.persado.assignment.project.form.CreateUserForm;
import com.persado.assignment.project.models.UserModel;
import org.springframework.stereotype.Component;

@Component
public class CreateUserToModelMapper {
    public UserModel createUserFormToUserModel(CreateUserForm createUserForm) {
        UserModel userModel = new UserModel();
        userModel.setFirstName(createUserForm.getFirstName());
        userModel.setLastName(createUserForm.getLastName());
        userModel.setAddress(createUserForm.getAddress());
        return userModel;
    }
}
