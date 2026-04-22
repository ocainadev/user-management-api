package dev.ocaina.usercontroller.Users;


import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {this.userService = userService;}

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAll(){
        List<UserDTO> list = userService.getAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        UserDTO user = userService.getById(id);
        if(user != null){
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Usuario não encontrado");
    }

    @PostMapping("/create")
    public ResponseEntity<String> post(@RequestBody UserDTO model){
        UserDTO user = userService.create(model);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario Criado:" + user.getName());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody UserDTO model){
        UserDTO user = userService.getById(id);
        if(user != null){
            userService.update(id,model);
            return ResponseEntity.ok(user);
        }
         return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){

        if(userService.getById(id) != null){
            userService.delete(id);
            return ResponseEntity.ok("Usuario Deletado");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
    }
}
