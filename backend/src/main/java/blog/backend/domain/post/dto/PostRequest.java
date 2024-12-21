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

    private String username;

    public PostRequest(String category, String title, String markdownContent ,String username) {
        this.category = category;
        this.title = title;
        this.markdownContent = markdownContent;
        this.username= username;
    }

    @Builder
    public Post convertPost(PostRequest postRequest){
        return Post.builder()
                .category(postRequest.category)
                .title(postRequest.title)
                .markdownContent(postRequest.markdownContent)
                .username(postRequest.username)
                .build();
    }
}
