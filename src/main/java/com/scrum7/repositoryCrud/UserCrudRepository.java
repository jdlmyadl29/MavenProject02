package com.scrum7.repositoryCrud;

import com.scrum7.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 *
 * @author Jeison Hernandez
 */

public interface UserCrudRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User>findByEmailAndPassword(String email, String password);

}
