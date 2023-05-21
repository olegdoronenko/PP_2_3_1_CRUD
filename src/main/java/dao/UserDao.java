package dao;

import model.User;
import java.util.List;

public interface UserDao {

    void addUser(User user);
    void deleteUser(User user);
    void deleteUser(long id);
    void modifyUser(User user);
    void cleanUserTable();
    List<User> getUsersList();
}
