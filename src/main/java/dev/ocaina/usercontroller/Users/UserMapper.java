package dev.ocaina.usercontroller.Users;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserModel map(UserDTO userDTO) {
        UserModel user = new UserModel();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setAge(userDTO.getAge());
        user.setRank(userDTO.getRank());
        user.setTasks(userDTO.getTasks());
        return user;
    }

    public UserDTO map(UserModel userModel) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userModel.getId());
        userDTO.setName(userModel.getName());
        userDTO.setEmail(userModel.getEmail());
        userDTO.setAge(userModel.getAge());
        userDTO.setRank(userModel.getRank());
        userDTO.setTasks(userModel.getTasks());
        return userDTO;
    }
}
