package blog.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    @PostMapping("/create")
    public String createMember(){
        return "member create ok";
    }
    @PatchMapping("/update")
    public String updateMember(){
        return "Member edit ok";
    }
    @GetMapping("/get")
    public String getMember(){
        return "get ok";
    }
    @GetMapping("/gets")
    public String getMembers(){
        return "gets ok";
    }
    @DeleteMapping("/delete")
    public String deleteMember(){
        return "delete ok";
    }
    @DeleteMapping("/deteles")
    public String deleteMembers(){
        return "deletes ok";
    }
}
