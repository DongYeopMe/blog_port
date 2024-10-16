package blog.backend.domain.post.service;

import blog.backend.domain.post.dto.PostRequest;
import blog.backend.domain.post.dto.PostResponse;
import blog.backend.domain.post.entity.Post;
import blog.backend.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public void posting(PostRequest postRequest) {
        Post post = postRequest.convertPost(postRequest);
        postRepository.save(post);
    }

    public void update(PostRequest postRequest) {
        Post findpost = postRepository.findByTitle(postRequest.getTitle());
        findpost.setCategory(postRequest.getCategory());
        findpost.setTitle(postRequest.getTitle());
        findpost.setMarkdownContent(postRequest.getMarkdownContent());
    }

    public PostResponse getPost(String title) {

    }
}
