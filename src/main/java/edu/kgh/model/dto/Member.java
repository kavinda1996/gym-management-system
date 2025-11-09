package edu.kgh.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

    private String memberId;
    private String name;
    private String email;
    private String address;
    private LocalDate dob;
    private double BMI;
    private String phoneNumber;
    private double registrationFee;
    private double subscription;
}