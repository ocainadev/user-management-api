package dev.ocaina.usercontroller.Users;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ninja")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {this.userService = userService;}

    @PostMapping("/create")
    public String post(){
        return "Cria um novo User";
    }

    @GetMapping("/all")
    public List<UserModel> getAll(){
        return userService.getAll();
    }

    @GetMapping("/id")
    public String id(){
        return "retorno user por id";
    }

    @PutMapping("/update")
    public String update(){
        return "Update User";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Delete User";
    }
}
