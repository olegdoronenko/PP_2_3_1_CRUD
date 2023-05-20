package service;

import model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void cleanUserTable();
    List<User> getUsersList();
}
