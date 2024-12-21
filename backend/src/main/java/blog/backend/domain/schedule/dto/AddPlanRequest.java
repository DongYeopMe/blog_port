package blog.backend.domain.schedule.dto;

import blog.backend.domain.schedule.entity.Schedule;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class AddPlanRequest {

    private String title;

    private String caption;

    private String color;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String username;
    @Builder
    public Schedule convertSchedule(AddPlanRequest addPlanRequest){
        return Schedule.builder()
                .title(addPlanRequest.title)
                .caption(addPlanRequest.caption)
                .color(addPlanRequest.color)
                .startDate(addPlanRequest.startDate)
                .endDate(addPlanRequest.endDate)
                .username(addPlanRequest.username)
                .build();
    }
}
