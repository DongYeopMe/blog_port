package blog.backend.domain.post.entity;

import blog.backend.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_id", nullable = false)
    private Long id;
    @Column(name="post_category", nullable = false)
    private String category;
    @Column(name="post_title", nullable = false)
    private String title;
    @Lob
    @Column(name="post_markdown", nullable = false)
    private String markdownContent;
    @Lob
    @Column(name="post_html", nullable = false)
    private String htmlContent;
    @Column(name="post_createAt", nullable = false)
    private LocalDateTime createAt;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Member user;
}
