package edu.kgh.model.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {

    private String userId;
    private String userName;
    private String password;
    private String role;
}
