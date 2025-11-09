package edu.kgh.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ScheduleEntity {
    @Id
    private String scheduleId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String timeDuration;
}