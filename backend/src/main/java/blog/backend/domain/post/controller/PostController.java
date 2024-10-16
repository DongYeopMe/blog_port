package blog.backend.domain.post.controller;

import blog.backend.domain.post.dto.PostRequest;
import blog.backend.domain.post.entity.Post;
import blog.backend.domain.post.service.PostService;
import blog.backend.global.ResultResponse;
import lombok.RequiredArgsConstructor;
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
        Post response = postService.getPost(title);
    }
    @GetMapping("/gets")
    public ResponseEntity<Object> getPosts(){
        return "gets ok";
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Object> deletePost(){
        return "delete ok";
    }
    @DeleteMapping("/deteles")
    public ResponseEntity<Object> deletePosts(){
        return "deletes ok";
    }
}
