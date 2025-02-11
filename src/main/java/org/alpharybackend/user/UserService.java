package org.alpharybackend.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Service layer for managing users. Handles business logic related to {@link UserModel} and
 * interacts with {@link UserRepository}.
 */
@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  /**
   * Retrieves all users from the repository.
   *
   * @return a {@link Flux} containing all {@link UserModel} entities
   */
  public Flux<UserModel> getAllUsers() {
    return userRepository.findAll();
  }

  /**
   * Creates a new user and saves it to the repository.
   *
   * @param username the username of the new user
   * @param password the password of the new user
   * @return a {@link Mono} containing the saved {@link UserModel}
   */
  public Mono<UserModel> createUser(String username, String password) {
    UserModel user = new UserModel();
    user.setUsername(username);
    user.setPassword(password);
    return userRepository.save(user);
  }
}
