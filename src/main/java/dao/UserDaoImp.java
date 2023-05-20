package dao;

import model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void saveUser(User user) {

    }

    @Override
    public void cleanUserTable() {

    }

    @Override
    public List<User> getUsersList() {
        return null;
    }
}
