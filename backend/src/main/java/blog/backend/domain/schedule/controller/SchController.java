package blog.backend.domain.schedule.controller;

import blog.backend.domain.schedule.dto.AddPlanRequest;
import blog.backend.domain.schedule.dto.EditPlanRequest;
import blog.backend.domain.schedule.service.SchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public String addPlan(AddPlanRequest addPlanRequest){
        return "test 완";
    }
    @PostMapping("/edit")
    public String editPlan(EditPlanRequest editPlanRequest){
        return "test 완";
    }

}
