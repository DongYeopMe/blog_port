package blog.backend.domain.post.dto;

import blog.backend.domain.post.entity.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostRequest {

    private String category;

    private String title;

    private String markdownContent;

    public PostRequest(String category, String title, String markdownContent) {
        this.category = category;
        this.title = title;
        this.markdownContent = markdownContent;
    }

    @Builder
    public Post convertPost(PostRequest postRequest){
        return Post.builder()
                .title(postRequest.category)
                .title(postRequest.title)
                .markdownContent(postRequest.markdownContent)
                .build();
    }
}
