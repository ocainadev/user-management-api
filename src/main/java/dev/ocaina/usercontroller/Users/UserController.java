package dev.ocaina.usercontroller.Users;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {this.userService = userService;}

    @GetMapping("/all")
    public List<UserModel> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserModel getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PostMapping("/create")
    public UserDTO post(@RequestBody UserDTO model){
        return userService.createUser(model);
    }

    @PutMapping("/update/{id}")
    public UserModel update(@PathVariable Long id, @RequestBody UserModel model){
        return userService.update(id,model);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
