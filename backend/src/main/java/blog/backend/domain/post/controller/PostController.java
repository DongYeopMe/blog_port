package blog.backend.domain.post.controller;

import blog.backend.domain.post.dto.PostGetconditions;
import blog.backend.domain.post.dto.PostRequest;
import blog.backend.domain.post.dto.PostResponse;
import blog.backend.domain.post.service.PostService;
import blog.backend.global.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static blog.backend.global.ResultCode.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping("/create")
    public ResponseEntity<Object> createPost(PostRequest postRequest){
        postService.posting(postRequest);
        return ResponseEntity.ok(ResultResponse.of(POSTING_SUCCESS,true));
    }
    @PatchMapping("/update")
    public ResponseEntity<Object> updatePost(String userID,PostRequest postRequest){
        postService.update(postRequest);
        return ResponseEntity.ok(ResultResponse.of(POSTING_SUCCESS,true));
    }
    @GetMapping("/get")
    public ResponseEntity<Object> getPost(String title){
        PostResponse response = postService.getPost(title);
        return ResponseEntity.ok(ResultResponse.of(GET_POST_SUCCESS,response));
    }
    @GetMapping("/gets")
    public ResponseEntity<Object> getPosts(@RequestParam(value = "page", defaultValue = "1") int page,
                                           @RequestParam(value = "size", defaultValue = "10") int size,
                                           PostGetconditions postGetconditions){
        Page<PostResponse> response = postService.getPosts(page,size, postGetconditions);

        return ResponseEntity.ok(ResultResponse.of(GET_POSTS_SUCCESS,response));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Object> deletePost(String title){
        postService.deletePost(title);
        return ResponseEntity.ok(ResultResponse.of(POST_DELETE_SUCCESS,true));;
    }
}
