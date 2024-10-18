package blog.backend.domain.post.dto;

import blog.backend.domain.post.entity.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostResponse {

    private String category;

    private String title;

    private String htmlContent;

    private LocalDateTime createAt;


    public PostResponse(String category, String title, String htmlContent, LocalDateTime createAt) {
        this.category = category;
        this.title = title;
        this.htmlContent = htmlContent;
        this.createAt = createAt;
    }
    public static PostResponse convertToResponse(Post post) {
        return new PostResponse(
                post.getCategory(),
                post.getTitle(),
                post.getHtmlContent(),
                post.getCreateAt()
        );
    }
}
