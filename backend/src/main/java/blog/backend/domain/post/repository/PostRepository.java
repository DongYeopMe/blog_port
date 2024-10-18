package blog.backend.domain.post.repository;

import blog.backend.domain.post.dto.PostGetconditions;
import blog.backend.domain.post.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostRepository extends JpaRepository<Post,Long> {
    @Query("select p from post p where p.title = :title")
    Post findByTitle(@Param("title") String title);

    @Query("SELECT p FROM Post p " +
            "WHERE p.userid = :#{#postGetconditions.userid} " +
            "AND (:#{#postGetconditions.category} IS NULL OR p.category = :#{#postGetconditions.category}) " +
            "AND (:#{#postGetconditions.search} IS NULL OR p.title LIKE %:#{#postGetconditions.search}% OR p.content LIKE %:#{#postGetconditions.search}%)")
    Page<Post> findByPosts(@Param("postGetconditions") PostGetconditions postGetconditions, Pageable pageable);

}
