package blog.backend.domain.member.service;

import blog.backend.domain.member.dto.FindMemberRequirements;
import blog.backend.domain.member.dto.LoginForm;
import blog.backend.domain.member.dto.MemberRequest;
import blog.backend.domain.member.dto.MemberResponse;
import blog.backend.domain.member.entity.Member;
import blog.backend.domain.member.repository.MemberRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public void createMember(MemberRequest memberRequest){
        Member savemember = Member.requestConvert(memberRequest);
        savemember.setPassword(passwordEncoder.encode(savemember.getPassword()));
        memberRepository.save(savemember);
    }
    public void editMember(MemberRequest memberRequest){
        Member findmember = memberRepository.findByUserName(memberRequest.getUsername());
        findmember.setUserid(memberRequest.getUserid());
        findmember.setPassword(memberRequest.getPassword());
        findmember.setUsername(memberRequest.getUsername());
    }
    public MemberResponse getMember(FindMemberRequirements findMemberRequirements){
        Member findmember = memberRepository.findByUserIdORUserName(findMemberRequirements.getUsername(), findMemberRequirements.getUsername());
        return MemberResponse.memberConvert(findmember);
    }
    public void deleteMember(FindMemberRequirements findMemberRequirements){
        Member findmember = memberRepository.findByUserIdORUserName(findMemberRequirements.getUsername(), findMemberRequirements.getUsername());
        memberRepository.delete(findmember);
    }

    public Boolean login(LoginForm loginForm) {
        Member member = memberRepository.findByUserid(loginForm.getUserid()).orElseThrow(()-> new EntityNotFoundException());
        return passwordEncoder.matches(loginForm.getPassword(),member.getPassword());
    }
}
