package com.digilab.springbootrefreshtoken2jan.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.digilab.springbootrefreshtoken2jan.models.RefreshToken;
import com.digilab.springbootrefreshtoken2jan.models.User;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends MongoRepository<RefreshToken, String> {
    Optional<RefreshToken> findByToken(String token);

    String deleteByUser(User user);
}