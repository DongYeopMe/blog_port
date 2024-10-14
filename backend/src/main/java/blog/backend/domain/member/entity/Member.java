package blog.backend.domain.member.entity;

import blog.backend.domain.member.dto.MemberRequest;
import jakarta.persistence.*;
import lombok.*;
@Builder
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="members")
public class Member {

    @Id
    @Column(name="member_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="member_userid",nullable = false)
    private String userid;
    @Column(name="member_password", nullable = false)
    private String password;
    @Column(name="member_username", nullable = false)
    private String username;


    public static Member requestConvert(MemberRequest memberRequest){
        return Member.builder()
                .userid(memberRequest.getUserid())
                .password(memberRequest.getPassword())
                .username(memberRequest.getUsername())
                .build();
    }
}
