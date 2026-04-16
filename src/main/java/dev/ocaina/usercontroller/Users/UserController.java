package dev.ocaina.usercontroller.Users;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {this.userService = userService;}

    @GetMapping("/all")
    public List<UserDTO> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PostMapping("/create")
    public UserDTO post(@RequestBody UserDTO model){
        return userService.create(model);
    }

    @PutMapping("/update/{id}")
    public UserDTO update(@PathVariable Long id, @RequestBody UserDTO model){
        return userService.update(id,model);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
}
