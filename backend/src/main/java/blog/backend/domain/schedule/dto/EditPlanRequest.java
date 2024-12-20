package blog.backend.domain.schedule.dto;

import blog.backend.domain.schedule.entity.Schedule;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class EditPlanRequest {

    private String title;

    private String caption;

    private String color;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Builder
    public Schedule convertSchedule(EditPlanRequest editPlanRequest){
        return Schedule.builder()
                .title(editPlanRequest.title)
                .caption(editPlanRequest.caption)
                .color(editPlanRequest.color)
                .startDate(editPlanRequest.startDate)
                .endDate(editPlanRequest.endDate)
                .build();
    }

}
