package dev.ocaina.usercontroller.Users;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/welcome")
    public String boasvindas(){
        return "Welcome to Users Controller";
    }

    // Adicionar user (create)
    @PostMapping("/create")
    public String post(){
        return "Cria um novo User";


    }

    // mostrar user por id (read)
    @GetMapping("/all")
    public String all(){
        return "All Users";
    }

    // mostrar todos usuarios (read)
    @GetMapping("/id")
    public String id(){
        return "id";
    }

    // alterar dados de usuario (update)
    @PutMapping("/update")
    public String update(){
        return "Update User";
    }

    // deletar usuarios (delete)
    @DeleteMapping("/delete")
    public String delete(){
        return "Delete User";
    }
}
