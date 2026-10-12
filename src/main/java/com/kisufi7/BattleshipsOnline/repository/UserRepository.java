package com.kisufi7.BattleshipsOnline.repository;

import com.kisufi7.BattleshipsOnline.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/** TODO: REPOSITORY und Nutzung dieser in Doku**/

public interface UserRepository extends JpaRepository<Users, Long> {

    List<Users> findByUsernameAndPassword(String username, String password);
}
