package blog.backend.domain.schedule.entity;

import blog.backend.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="schedule_id", nullable = false)
    private Long id;
    @Column(name="schedule_title", nullable = false)
    private String title;
    @Column(name="schedule_caption", nullable = false)
    private String caption;
    @Column(name="schedule_color", nullable = false)
    private String color;
    @Column(name="schedule_startDate", nullable = false)
    private LocalDateTime startDate;
    @Column(name="schedule_endDate", nullable = false)
    private LocalDateTime endDate;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Member user;
}
