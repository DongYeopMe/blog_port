package blog.backend.domain.member.controller;

import blog.backend.domain.member.dto.FindMemberRequirements;
import blog.backend.domain.member.dto.MemberRequest;
import blog.backend.domain.member.dto.MemberResponse;
import blog.backend.domain.member.service.MemberService;
import blog.backend.global.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static blog.backend.global.ResultCode.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;


    @PostMapping("/create")
    public ResponseEntity<Object> createMember(MemberRequest memberRequest){
        memberService.createMember(memberRequest);
        return ResponseEntity.ok(ResultResponse.of(SIGNUP_SUCCESS,true));
    }
    @PatchMapping("/update")
    public ResponseEntity<Object> updateMember(MemberRequest memberRequest){
        memberService.editMember(memberRequest);
        return ResponseEntity.ok(ResultResponse.of(UPDATE_SUCCESS,true));
    }
    @GetMapping("/get")
    public ResponseEntity<Object> getMember(FindMemberRequirements findMemberRequirements){
        MemberResponse memberResponse = memberService.getMember(findMemberRequirements);
        return ResponseEntity.ok(ResultResponse.of(GET_MEMBER,memberResponse));
    }
    @GetMapping("/gets")
    public ResponseEntity<Object> getMembers(){
        return "gets ok";
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteMember(){
        return "delete ok";
    }
    @DeleteMapping("/deteles")
    public ResponseEntity<Object> deleteMembers(){
        return "deletes ok";
    }
}