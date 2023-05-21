package service;

import model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(User user);
    void modifyUser(User user);
    void cleanUserTable();
    List<User> getUsersList();
}
