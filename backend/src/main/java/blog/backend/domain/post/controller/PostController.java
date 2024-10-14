package blog.backend.domain.post.controller;

import blog.backend.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping("/create")
    public ResponseEntity<Object> createPost(){
        return "post ok";
    }
    @PatchMapping("/update")
    public ResponseEntity<Object> updatePost(){
        return "edit ok";
    }
    @GetMapping("/get")
    public ResponseEntity<Object> getPost(){
        return "get ok";
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
