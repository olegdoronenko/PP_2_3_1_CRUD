package dao;

import model.User;
import java.util.List;

public interface UserDao {

    void saveUser(User user);
    void cleanUserTable();
    List<User> getUsersList();
}
