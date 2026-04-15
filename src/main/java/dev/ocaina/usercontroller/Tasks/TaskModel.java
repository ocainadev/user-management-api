package dev.ocaina.usercontroller.Tasks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.ocaina.usercontroller.Users.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_tasks")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "difficult")
    private String difficult;

    @Column(name = "rank")
    private String rank;

    // Uma Task para varias pessoas
    @OneToMany(mappedBy = "tasks")
    @JsonIgnore
    List<UserModel> users;

}
