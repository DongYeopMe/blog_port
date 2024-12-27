package blog.backend.domain.member.controller;

import blog.backend.domain.member.dto.FindMemberRequirements;
import blog.backend.domain.member.dto.LoginForm;
import blog.backend.domain.member.dto.MemberRequest;
import blog.backend.domain.member.dto.MemberResponse;
import blog.backend.domain.member.entity.Member;
import blog.backend.domain.member.service.MemberService;
import blog.backend.global.ResultResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import static blog.backend.global.ResultCode.*;
import static blog.backend.global.SessionManager.SESSION_COOKIE_NAME;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;


    @PostMapping("/register")
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

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginForm loginForm, HttpServletRequest request) {
        // 로그인 성공 여부 확인
        boolean loginSuccess = memberService.login(loginForm);
        if (!loginSuccess) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패");
        }

        // 로그인 성공 시 세션 생성 및 회원 정보 저장
        HttpSession session = request.getSession(true); // 세션이 없으면 새로 생성
        session.setAttribute(SESSION_COOKIE_NAME, loginForm.getUserid()); // 세션에 사용자 정보 저장
        session.setMaxInactiveInterval(60 * 30);//만료 기간 30분

        return ResponseEntity.ok("로그인 성공");
    }
    @PostMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false); // 세션이 없으면 null 반환
        if (session != null) {
            session.invalidate(); // 세션 무효화
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("로그아웃 실패");
        }
        return ResponseEntity.ok("로그아웃 성공");
    }

}
