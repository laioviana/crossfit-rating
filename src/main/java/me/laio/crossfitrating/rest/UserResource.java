package me.laio.crossfitrating.rest;

import me.laio.crossfitrating.domain.User;
import me.laio.crossfitrating.security.SecurityUtils;
import me.laio.crossfitrating.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.LoginException;

import javax.inject.Inject;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @Inject
    private UserService userService;

    @GetMapping(value = "/current", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity findCurrentUser() throws LoginException {
        User currentUser = SecurityUtils.getCurrentUser();
        return ok(currentUser);
    }

    @GetMapping(value = "/find-all", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity findAll() {
        List<User> users = userService.findAllUsers();
        return ok(users);
    }
}
