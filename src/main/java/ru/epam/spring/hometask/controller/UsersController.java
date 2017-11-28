package ru.epam.spring.hometask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.epam.spring.hometask.common.SpringException;
import ru.epam.spring.hometask.controller.base.BaseController;
import ru.epam.spring.hometask.domain.User;
import ru.epam.spring.hometask.service.UserService;

@Controller
public class UsersController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public String getUsers(ModelMap model) {
        model.addAttribute("users", userService.getUsers());
        return "users";
    }

    @RequestMapping("/user/add")
    public String addNewUser(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("email") String email,
            @RequestParam("birthday") String birthday) {

        if (!email.contains("@")) {
            throw new SpringException("42", "email does not contain @ symbol");
        }

        userService.addUser(firstName, lastName, email, birthday);
        return "redirect:/users";
    }

    @RequestMapping("/user/getByEmail")
    public String getUserByEmail(
            @RequestParam("email") String email,
            ModelMap model) {

        User user = userService.getUserByEmail(email);
        if (user == null) {
            throw new SpringException("25", String.format("user with %s box was not found", email));
        }

        model.addAttribute("user", user);
        return "user";
    }
}
