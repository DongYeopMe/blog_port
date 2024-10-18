package blog.backend.domain.post.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostEditResponse {

    private String category;

    private String title;

    private String markdownContent;

    private String htmlContent;
}
