package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<User> usersList;
        usersList = userService.getUsersList();


        model.addAttribute("usersList", usersList);
        return "index";
    }

}