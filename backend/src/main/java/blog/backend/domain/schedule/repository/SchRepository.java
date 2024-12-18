package blog.backend.domain.schedule.repository;

import blog.backend.domain.schedule.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchRepository extends JpaRepository<Schedule,Long> {
}
