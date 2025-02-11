package org.alpharybackend.user;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/** Entity representing a user in the system. Mapped to the "users" table in the database. */
@Data
@Table("users")
public class UserModel {
  @Id private Long id;
  private String username;
  private String password;
}
