package me.laio.crossfitrating.repository;

import me.laio.crossfitrating.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByLogin(String login);
}
