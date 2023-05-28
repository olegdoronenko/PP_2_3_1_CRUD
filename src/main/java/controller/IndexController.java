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

    @GetMapping("{id}")
    public String printOneUser(@PathVariable("id") long id, ModelMap model) {
        model.addAttribute("user", userService.findUserById(id));
        return "show";
    }

    @GetMapping("new")
    public String printAddForm(ModelMap model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping()
    public String createNewUser(@ModelAttribute("user") User user, ModelMap model) {
        userService.addUser(user);
        model.addAttribute("user");
        printOneUser(user.getId(), model);
        return "show";
    }

}