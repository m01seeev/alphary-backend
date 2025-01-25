package org.alpharybackend.User;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<UserModel, Long> {
}
