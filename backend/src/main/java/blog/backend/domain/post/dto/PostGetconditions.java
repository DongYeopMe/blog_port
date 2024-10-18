package blog.backend.domain.post.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostGetconditions {

    private String userid;
    private String category;
    private String search;

}
