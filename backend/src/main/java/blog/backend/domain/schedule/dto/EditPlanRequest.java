package blog.backend.domain.schedule.dto;

import blog.backend.domain.schedule.entity.Schedule;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("SchId")
    private Long schId;

    public void updateSchedule(Schedule schedule,EditPlanRequest editPlanRequest){
        schedule.setTitle(editPlanRequest.title);
        schedule.setCaption(editPlanRequest.caption);
        schedule.setColor(editPlanRequest.color);
        schedule.setStartDate(editPlanRequest.startDate);
        schedule.setEndDate(editPlanRequest.endDate);
    }

}
