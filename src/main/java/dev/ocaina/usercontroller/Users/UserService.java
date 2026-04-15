package dev.ocaina.usercontroller.Users;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserModel> getAll() {
        return userRepository.findAll();
    }

    public UserModel getById(Long id){
        Optional<UserModel> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public UserDTO createUser(UserDTO dto) {
        UserModel model = userMapper.map(dto);
        userRepository.save(model);
        return userMapper.map(model);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public UserModel update(Long id, UserModel model) {
        if (userRepository.existsById(id)) {
            model.setId(id);
            return userRepository.save(model);
        } else
            return null;
    }
}
