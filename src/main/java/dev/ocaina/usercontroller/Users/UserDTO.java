package dev.ocaina.usercontroller.Users;

import dev.ocaina.usercontroller.Tasks.TaskModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private int age;
    private String rank;
    private TaskModel tasks;
}
