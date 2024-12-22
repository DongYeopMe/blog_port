package blog.backend.domain.schedule.service;

import blog.backend.domain.schedule.dto.AddPlanRequest;
import blog.backend.domain.schedule.entity.Schedule;
import blog.backend.domain.schedule.repository.SchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchService {
    private final SchRepository schRepository;
    public void createPlan(AddPlanRequest addPlanRequest) {

    }
    public List getPlans(int year,int month){
        List<Schedule> list = schRepository.findByYearAndMonth(year,month);
        return list;
    }
}
