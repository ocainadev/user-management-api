package dev.ocaina.usercontroller.Users;
import dev.ocaina.usercontroller.Tasks.TaskModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(unique = true)
    private String email;

    @Column(name = "age")
    private int age;

    @Column(name = "rank")
    private String rank;

    @ManyToOne
    @JoinColumn(name= "tasks_id")
    private TaskModel tasks;

}
