package ru.kata.springBootSecurity.dao;

import org.springframework.stereotype.Repository;
import ru.kata.springBootSecurity.model.User;
import java.util.List;

@Repository
public interface UserDao {
    User findByUserEmail(String email);

    User getUser(Long id);

    List<User> getAllUsers();

    void addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);
}
