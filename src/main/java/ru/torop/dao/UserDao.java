package ru.torop.dao;

import ru.torop.model.User;
import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> listUsers();
    void deleteUser(long id);
    void updateUser(long id,User user);
    User findUserById(long id);
}
