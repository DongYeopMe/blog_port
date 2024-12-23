package blog.backend.domain.schedule.controller;

import blog.backend.domain.schedule.dto.AddPlanRequest;
import blog.backend.domain.schedule.dto.EditPlanRequest;
import blog.backend.domain.schedule.entity.Schedule;
import blog.backend.domain.schedule.service.SchService;
import blog.backend.global.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static blog.backend.global.ResultCode.*;

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
    public ResponseEntity<ResultResponse> addPlan(@RequestBody AddPlanRequest addPlanRequest){
        schService.createPlan(addPlanRequest);
        return ResponseEntity.ok(ResultResponse.of(SCHEDULE_CREATE_SUCCESS,true));
    }
    @PatchMapping("/edit")
    public ResponseEntity<ResultResponse> editPlan(@RequestBody EditPlanRequest editPlanRequest){
        schService.editPlan(editPlanRequest);
        return ResponseEntity.ok(ResultResponse.of(SCHEDULE_EDIT_SUCCESS,true));
    }
    @GetMapping("/getPlans")
    public ResponseEntity<ResultResponse> getPlans(@RequestParam int year,
                           @RequestParam int month){
        List<Schedule> response = schService.getPlans(year,month);
        return ResponseEntity.ok(ResultResponse.of(GET_SCHEDULES_SUCCESS,response));
    }
    @DeleteMapping("/delete")
    public String deletePlan(){
        return "test 완";
    }

}
