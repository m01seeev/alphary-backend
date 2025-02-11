package org.alpharybackend.user;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Reactive repository interface for managing {@link UserModel} entities. Provides CRUD operations
 * and supports reactive streams.
 */
public interface UserRepository extends ReactiveCrudRepository<UserModel, Long> {}
