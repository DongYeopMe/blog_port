package blog.backend.domain.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FindMemberRequirements {
    private String userid;
    private String username;
}
