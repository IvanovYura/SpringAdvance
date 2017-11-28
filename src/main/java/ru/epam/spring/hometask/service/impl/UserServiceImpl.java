package ru.epam.spring.hometask.service.impl;

import ru.epam.spring.hometask.domain.User;
import ru.epam.spring.hometask.repository.MapBasedIdentityRepository;
import ru.epam.spring.hometask.repository.UserRepository;
import ru.epam.spring.hometask.service.RepositoryBasedDomainObjectService;
import ru.epam.spring.hometask.service.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserServiceImpl extends RepositoryBasedDomainObjectService<User> implements UserService {

    UserServiceImpl(MapBasedIdentityRepository<User> repository) {
        super(repository);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        for (Map.Entry<Long, User> entry : repository.getMap().entrySet()) {
            users.add(entry.getValue());
        }
        return users;
    }

    @Override
    public User getUserByEmail(String email) {
        return ((UserRepository) repository).findSingleOrDefault(email);
    }

    @Override
    public void addUser(
            String firstName,
            String lastName,
            String email,
            String birthday) {

        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setBirthday(LocalDate.parse(birthday));
        repository.add(user);
    }
}
