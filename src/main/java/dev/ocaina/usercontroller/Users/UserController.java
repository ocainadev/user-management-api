package dev.ocaina.usercontroller.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/welcome")
    public String Welcome() {
        return "Welcome to Spring Boot!";
    }

}
