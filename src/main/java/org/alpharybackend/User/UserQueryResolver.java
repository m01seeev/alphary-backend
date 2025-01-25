package org.alpharybackend.User;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
@RequiredArgsConstructor
public class UserQueryResolver {
    private final UserService userService;

    @QueryMapping
    public Flux<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }
}
