package org.alpharybackend.User;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Flux<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public Mono<UserModel> createUser(String username, String password) {
        UserModel user = new UserModel();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
