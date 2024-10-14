package blog.backend.domain.member.dto;

import blog.backend.domain.member.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MemberResponse {
    private String userid;
    private String username;

    public MemberResponse(String username, String userid) {
        this.username = username;
        this.userid = userid;
    }
    public static MemberResponse memberConvert(Member member){
        return new MemberResponse(member.getUsername(),member.getUserid());
    }
}
