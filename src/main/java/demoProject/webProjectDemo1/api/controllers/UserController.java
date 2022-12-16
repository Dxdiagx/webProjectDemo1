package demoProject.webProjectDemo1.api.controllers;

import demoProject.webProjectDemo1.business.abstracts.UserService;
import demoProject.webProjectDemo1.core.utilities.results.Result;
import demoProject.webProjectDemo1.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getall")
    public List<User> getAll(){
        return this.userService.getAll();
    }

    @PostMapping("/save")
    public Result add(@RequestBody User users){
        return this.userService.add(users);
    }

}
