package org.alpharybackend.User;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("users")
public class UserModel {
    @Id
    private Long id;
    private String username;
    private String password;
}
