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

    //private static User user = new User();
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.saveUser(new User("Gorgu", "Barbarian", 3));




//        user.setNickName("Gorgy");
//        user.setPlayerClass("Barbarian");
//        user.setPlayerLevel(5);
//        System.out.println(user.getNickName());
//        System.out.println(user.getPlayerClass());
//        System.out.println(user.getPlayerLevel());

    }
}
