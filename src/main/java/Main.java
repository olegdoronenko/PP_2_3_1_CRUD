import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Main {

    private static User user = new User();
    public static void main(String[] args) {
        user.setNickName("Gorgy");
        user.setPlayerClass("Barbarian");
        user.setPlayerLevel(5);
        System.out.println(user.getNickName());
        System.out.println(user.getPlayerClass());
        System.out.println(user.getPlayerLevel());

    }
}
