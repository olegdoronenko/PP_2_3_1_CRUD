package service;

import model.User;
import dao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService{

//    @Autowired
//    private EntityManager entityManager;
    @Autowired
    private UserDao userDao;


    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }


    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }


    @Override
    public void modifyUser(User user) {
        userDao.modifyUser(user);
    }

    @Override
    public void cleanUserTable() {
        userDao.cleanUserTable();
    }


    @Override
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }
}
