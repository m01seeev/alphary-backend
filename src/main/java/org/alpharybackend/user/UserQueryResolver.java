package org.alpharybackend.user;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

/**
 * GraphQL Query resolver for user-related queries. Provides operations for retrieving user
 * information.
 */
@Controller
@RequiredArgsConstructor
public class UserQueryResolver {
  private final UserService userService;

  /**
   * GraphQL's query to get all users.
   *
   * @return a {@link Flux} containing {@link UserModel} objects
   */
  @QueryMapping
  public Flux<UserModel> getAllUsers() {
    return userService.getAllUsers();
  }
}
