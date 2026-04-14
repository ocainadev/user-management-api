package dev.ocaina.usercontroller.Users;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> getAll() {
        return userRepository.findAll();
    }

    public UserModel getById(Long id){
        Optional<UserModel> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public UserModel createUser(UserModel model) {
        return userRepository.save(model);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
