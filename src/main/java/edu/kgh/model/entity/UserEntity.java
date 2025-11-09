package edu.kgh.model.entity;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserEntity {
    @Id
    private String userId;
    private String userName;
    private String password;
    private String role;
}
