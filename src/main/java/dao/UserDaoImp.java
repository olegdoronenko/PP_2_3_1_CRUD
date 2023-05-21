package dao;

import model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    public User findUserById(long id) {
        return entityManager.find(User.class, id);
    }
    @Override
    public void deleteUser(User user) {
        entityManager.remove(user);
        entityManager.flush();
    }
    @Override
    public void deleteUser(long id) {
        User user = findUserById(id);
        entityManager.remove(user);
        entityManager.flush();
    }

    @Override
    public void modifyUser(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    @Override
    public void cleanUserTable() {

    }

    @Override
    public List<User> getUsersList() {
        return entityManager.createQuery("FROM model.User", User.class).getResultList();
    }
}
