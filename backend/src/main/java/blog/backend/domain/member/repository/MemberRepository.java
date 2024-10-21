package blog.backend.domain.member.repository;

import blog.backend.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    @Query("select m From Member m where m.username = :username")
    Member findByUserId(@Param("username") String username);
    @Query("select m From Member m where m.username = :username OR m.userid = :userid")
    Member findByUserIdORUserName(@Param("username") String username,@Param("userid") String userid);
}
