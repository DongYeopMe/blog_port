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
    public ResponseEntity<Object> createMember(@RequestBody MemberRequest memberRequest){
        memberService.createMember(memberRequest);
        return ResponseEntity.ok(ResultResponse.of(SIGNUP_SUCCESS,true));
    }
    @PatchMapping("/update")
    public ResponseEntity<Object> updateMember(@RequestBody MemberRequest memberRequest){
        memberService.editMember(memberRequest);
        return ResponseEntity.ok(ResultResponse.of(UPDATE_SUCCESS,true));
    }
    @GetMapping("/get")
    public ResponseEntity<Object> getMember(@RequestBody FindMemberRequirements findMemberRequirements){
        MemberResponse memberResponse = memberService.getMember(findMemberRequirements);
        return ResponseEntity.ok(ResultResponse.of(GET_MEMBER,memberResponse));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteMember(){
        return ResponseEntity.ok(ResultResponse.of(DELETE_SUCCESS,true));
    }
}
