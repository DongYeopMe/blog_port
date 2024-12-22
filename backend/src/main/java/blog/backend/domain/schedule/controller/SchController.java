package blog.backend.domain.schedule.controller;

import blog.backend.domain.schedule.dto.AddPlanRequest;
import blog.backend.domain.schedule.dto.EditPlanRequest;
import blog.backend.domain.schedule.entity.Schedule;
import blog.backend.domain.schedule.service.SchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* 일정 추가, 수정,삭제,
*
* */
@RestController
@RequiredArgsConstructor
@RequestMapping("/schedule")
public class SchController {
    private final SchService schService;


    @PostMapping("/add")
    public String addPlan(@RequestBody AddPlanRequest addPlanRequest){
        schService.createPlan(addPlanRequest);
        return "test 완";
    }
    @PatchMapping("/edit")
    public String editPlan(EditPlanRequest editPlanRequest){
        return "test 완";
    }
    @GetMapping("/getPlans")
    public String getPlans(@RequestParam int year,
                           @RequestParam int month){
        List<Schedule> response = schService.getPlans(year,month);
        return "test 완";
    }
    @DeleteMapping("/delete")
    public String deletePlan(){
        return "test 완";
    }

}
