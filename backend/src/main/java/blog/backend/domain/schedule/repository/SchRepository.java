package blog.backend.domain.schedule.repository;

import blog.backend.domain.schedule.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchRepository extends JpaRepository<Schedule,Long> {
    @Query("SELECT s FROM Schedule s WHERE YEAR(s.startDate) = :year AND MONTH(s.startDate) = :month")
    List<Schedule> findByYearAndMonth(@Param("year") int year, @Param("month") int month);


}
