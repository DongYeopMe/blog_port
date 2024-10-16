package blog.backend.domain.post.entity;

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
    private Long id;

    private String category;

    private String title;
    @Lob
    private String markdownContent;
    @Lob
    private String htmlContent;

    private LocalDateTime createAt;

    @OneToMany
    private String userId;
}
