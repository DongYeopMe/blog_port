package blog.backend.controller;

import blog.backend.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping("/create")
    public String createPost(){
        return "post ok";
    }
    @PatchMapping("/update")
    public String updatePost(){
        return "edit ok";
    }
    @GetMapping("/get")
    public String getPost(){
        return "get ok";
    }
    @GetMapping("/gets")
    public String getPosts(){
        return "gets ok";
    }
    @DeleteMapping("/delete")
    public String deletePost(){
        return "delete ok";
    }
    @DeleteMapping("/deteles")
    public String deletePosts(){
        return "deletes ok";
    }
}
