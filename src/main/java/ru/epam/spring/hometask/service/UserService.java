package ru.epam.spring.hometask.service;

import ru.epam.spring.hometask.domain.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUserByEmail(String email);

    void addUser(String firstName,
                 String lastName,
                 String email,
                 String birthday);

}
