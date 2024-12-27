package blog.backend.domain.schedule.service;

import blog.backend.domain.schedule.dto.AddPlanRequest;
import blog.backend.domain.schedule.dto.EditPlanRequest;
import blog.backend.domain.schedule.entity.Schedule;
import blog.backend.domain.schedule.repository.SchRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchService {
    private final SchRepository schRepository;
    @Transactional
    public void createPlan(AddPlanRequest addPlanRequest) {
        schRepository.save(addPlanRequest.convertSchedule(addPlanRequest));
    }
    public List getPlans(int year,int month){
        List<Schedule> response = schRepository.findByYearAndMonth(year,month);
        return response;
    }

    @Transactional
    public void editPlan(EditPlanRequest editPlanRequest) {
        Schedule findEntity = schRepository.findById(editPlanRequest.getSchId()).orElseThrow(()->new EntityNotFoundException("해당 엔티티를 찾을수 없습니다."));
        editPlanRequest.updateSchedule(findEntity,editPlanRequest);
    }
}
