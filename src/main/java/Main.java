import config.AppConfig;
import model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import service.UserService;

import java.sql.SQLException;

@Service
public class Main {

    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

//        userService.addUser(new User("Pikabu", "Cleric", 1));
//        userService.addUser(new User("00Dwarf", "Thief", 5));
//        userService.addUser(new User("Baylong", "Palladin", 2));
        for (User user: userService.getUsersList()) {
            System.out.println(user.getNickName());
        }

        userService.cleanUserTable();




    }
}
