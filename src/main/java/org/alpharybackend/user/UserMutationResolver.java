package org.alpharybackend.user;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

/**
 * GraphQL Mutation resolver for user-related operations. Handles user creation and delegates
 * business logic to {@link UserService}.
 */
@Controller
@RequiredArgsConstructor
public class UserMutationResolver {
  private final UserService userService;

  /**
   * GraphQL's mutation to create a new user.
   *
   * @param username the username of the new user
   * @param password the password of the new user
   * @return a {@link Mono} containing the created {@link UserModel}
   */
  @MutationMapping
  public Mono<UserModel> createUser(@Argument String username, @Argument String password) {
    return userService.createUser(username, password);
  }
}
