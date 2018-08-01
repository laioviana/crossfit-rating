package me.laio.crossfitrating.service;

import me.laio.crossfitrating.domain.User;
import me.laio.crossfitrating.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUsuarioByLogin(String login) {
        return userRepository.findOneByLogin(login);
    }

}
