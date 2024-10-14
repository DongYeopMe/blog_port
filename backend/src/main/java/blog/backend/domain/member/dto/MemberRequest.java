package blog.backend.domain.member.dto;



import blog.backend.domain.member.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberRequest {
    private String userid;
    private String password;
    private String username;

    public MemberRequest(String userid, String password, String username) {
        this.userid = userid;
        this.password = password;
        this.username = username;
    }
    @Builder
    public Member requestConvert(MemberRequest memberRequest){
        return Member.builder()
                .userid(memberRequest.getUserid())
                .password(memberRequest.getPassword())
                .username(memberRequest.getUsername())
                .build();
    }

}
