package com.persado.assignment.project.controller.mappers;

import com.persado.assignment.project.form.DeleteForm;
import com.persado.assignment.project.models.UserModel;
import org.springframework.stereotype.Component;

@Component
public class DeleteMapper {
    public UserModel userDelete(DeleteForm deleteForm) {
        UserModel userModel = new UserModel();
        userModel.setId(deleteForm.getId());
        return userModel;
    }
}
