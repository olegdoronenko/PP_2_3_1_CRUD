package service;

import model.User;
import dao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Transactional
    @Override
    public void modifyUser(User user) {
        userDao.modifyUser(user);
    }

    @Transactional
    @Override
    public void cleanUserTable() {
        userDao.cleanUserTable();
    }

    @Transactional
    @Override
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }
}
