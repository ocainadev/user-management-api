package dev.ocaina.usercontroller.Users;
import dev.ocaina.usercontroller.Tasks.TaskModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    // varias pessoas uma task
    @ManyToOne
    @JoinColumn(name= "tasks_id")
    private TaskModel tasks;

}
