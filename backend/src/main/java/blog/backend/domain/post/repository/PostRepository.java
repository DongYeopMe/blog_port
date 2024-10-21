package blog.backend.domain.post.repository;

import blog.backend.domain.post.dto.PostGetConditions;
import blog.backend.domain.post.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    @Query("SELECT p FROM Post p WHERE p.title = :title")
    Post findByTitle(@Param("title") String title);


    @Query("SELECT p FROM Post p " +
            "WHERE (:userid IS NULL OR p.userid = :userid) " +
            "AND (:category IS NULL OR p.category = :category) " +
            "AND (:search IS NULL OR p.title LIKE CONCAT('%', :search, '%') OR p.content LIKE CONCAT('%', :search, '%'))")
    Page<Post> findByPosts(@Param("userid") String userid,
                           @Param("category") String category,
                           @Param("search") String search,
                           Pageable pageable);


}
