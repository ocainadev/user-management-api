package dev.ocaina.usercontroller.Tasks;

import dev.ocaina.usercontroller.Users.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaksController {

    @GetMapping("/all")
    public String get(){
        return "Listar Missoes";
    }
    @PostMapping("/create")
    public String post(){
        return "Cria um novo User";
    }

    @PutMapping("/update")
    public String put(){
        return "Atualiza um novo User";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Deleta um novo User";
    }

}
