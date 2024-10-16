package blog.backend.domain.post.repository;

import blog.backend.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostRepository extends JpaRepository<Post,Long> {
    @Query("select p from post p where p.title = :title")
    Post findByTitle(@Param("title") String title);
}
