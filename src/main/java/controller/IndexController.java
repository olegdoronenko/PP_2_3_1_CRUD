package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String printUsersList(ModelMap model) {
        model.addAttribute("usersList", userService.getUsersList());
        return "index";
    }

    @GetMapping("/{id}")
    public String printOneUser(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.findUserById(id));
        return "show";
    }

    @PostMapping()
    public String printNew(@RequestParam("nickname") String nickName, @RequestParam("player-class") String playerClass,
                         @RequestParam("player-level") int playerLevel, ModelMap model) {
        User user = new User(nickName, playerClass, playerLevel);

        model.addAttribute("usersList", user);
        userService.addUser(user);
       return "success page";
    }



}