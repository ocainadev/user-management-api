package dev.ocaina.usercontroller.Users;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserDTO> getAll() {
        List<UserModel> users = userRepository.findAll();
        return users.stream()
                .map(userMapper::map)
                .collect(Collectors.toList());
    }

    public UserDTO getById(Long id){
        Optional<UserModel> user = userRepository.findById(id);
        return user.map(userMapper::map).orElse(null);
    }

    public UserDTO create(UserDTO dto) {
        UserModel model = userMapper.map(dto);
        userRepository.save(model);
        return userMapper.map(model);
    }
    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public UserDTO update(Long id, UserDTO dto) {
        Optional<UserModel> model = userRepository.findById(id);
        if(model.isPresent()) {
            UserModel userModel = userMapper.map(dto);
            userModel.setId(id);
            userRepository.save(userModel);
            return userMapper.map(userModel);
        }
        return null;
    }
}
