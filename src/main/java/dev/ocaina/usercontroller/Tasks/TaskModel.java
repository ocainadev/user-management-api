package dev.ocaina.usercontroller.Tasks;

import dev.ocaina.usercontroller.Users.UserModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_tasks")
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int difficult;

    // Uma Task para varias pessoas
    @OneToMany(mappedBy = "tasks")
    List<UserModel> users;

}
