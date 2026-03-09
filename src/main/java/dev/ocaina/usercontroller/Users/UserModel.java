package dev.ocaina.usercontroller.Users;
import dev.ocaina.usercontroller.Tasks.TaskModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int age;

    // varias pessoas uma task
    @ManyToOne
    @JoinColumn(name= "tasks_id")
    private TaskModel tasks;

    public UserModel() {}
    public UserModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
