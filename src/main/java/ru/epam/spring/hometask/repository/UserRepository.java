package ru.epam.spring.hometask.repository;

import ru.epam.spring.hometask.domain.User;

import java.util.Collection;
import java.util.Map;

public class UserRepository extends MapBasedIdentityRepository<User> {

    public UserRepository(Collection<User> users) {
        super(users);
    }

    public User findSingleOrDefault(String email) {
        for (Map.Entry<Long, User> entry : getMap().entrySet()) {
            User user = entry.getValue();
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
