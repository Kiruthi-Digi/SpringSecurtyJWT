package com.digilab.springbootrefreshtoken2jan.repos;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.digilab.springbootrefreshtoken2jan.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}