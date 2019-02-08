package com.persado.assignment.project.controller;

import com.persado.assignment.project.controller.mappers.CreateUserToModelMapper;

import com.persado.assignment.project.controller.mappers.DeleteMapper;
import com.persado.assignment.project.domain.User;
import com.persado.assignment.project.form.CreateUserForm;
import com.persado.assignment.project.form.DeleteForm;
import com.persado.assignment.project.models.UserModel;
import com.persado.assignment.project.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;


@Controller
public class UserController {
    private static final String CREATE_USER_FORM = "createUserForm";
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    private CreateUserToModelMapper mapper;
    @Autowired
    private DeleteMapper deleteMapper;

    @GetMapping(value = "/create_user")
    public String createUser(Model model) {
        model.addAttribute(CREATE_USER_FORM,
                new CreateUserForm());
        return "create_user";


    }
    @PostMapping(value = "/create_user")
    public String createUser(Model model,
                             @Valid @ModelAttribute(CREATE_USER_FORM)
                                     CreateUserForm createUserForm,
                             BindingResult bindingResult){


        UserModel userModel = mapper.createUserFormToUserModel(createUserForm);
        userServiceImpl.create(userModel);
        return "redirect:/";
    }
    @GetMapping("/manage_users")
    public String usersList(Model model){
        List<User> user = userServiceImpl.findAll();
        model.addAttribute("list",user);
        return "manage_users";
    }
    @GetMapping("/delete_user")
    public String deleteUser(Model model,
                                    DeleteForm deleteForm){
        List<User> user = userServiceImpl.findAll();
        model.addAttribute("list",user);
        UserModel userModel = deleteMapper.userDelete(deleteForm);
        userServiceImpl.delete(userModel.getId());
        return "redirect:/manage_users";
    }



}
