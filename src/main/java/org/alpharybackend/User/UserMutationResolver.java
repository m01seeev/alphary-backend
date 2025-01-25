package org.alpharybackend.User;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class UserMutationResolver {
    private final UserService userService;

    @MutationMapping
    public Mono<UserModel> createUser(@Argument String username,@Argument String password) {
        return userService.createUser(username, password);
    }
}
