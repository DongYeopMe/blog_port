package blog.backend.domain.member.service;

import blog.backend.domain.member.dto.FindMemberRequirements;
import blog.backend.domain.member.dto.MemberRequest;
import blog.backend.domain.member.dto.MemberResponse;
import blog.backend.domain.member.entity.Member;
import blog.backend.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void createMember(MemberRequest memberRequest){
        Member savemember = Member.requestConvert(memberRequest);
        memberRepository.save(savemember);
    }
    public void editMember(MemberRequest memberRequest){
        Member findmember = memberRepository.findByUserId(memberRequest.getUsername());
        findmember.setUserid(memberRequest.getUserid());
        findmember.setPassword(memberRequest.getPassword());
        findmember.setUsername(memberRequest.getUsername());
    }
    public MemberResponse getMember(FindMemberRequirements findMemberRequirements){
        Member findmember = memberRepository.findByUserIdORUserName(findMemberRequirements.getUsername(), findMemberRequirements.getUsername());
        return MemberResponse.memberConvert(findmember);
    }
}
