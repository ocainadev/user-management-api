package dev.ocaina.usercontroller.Users;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    Example<UserModel> id(Long id);
}
