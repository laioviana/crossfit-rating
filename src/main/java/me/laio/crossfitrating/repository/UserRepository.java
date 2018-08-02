package me.laio.crossfitrating.repository;

import me.laio.crossfitrating.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByLogin(String login);

    List<User> findAll();
}
