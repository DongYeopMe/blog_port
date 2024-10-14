package blog.backend.global;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    //멤버
    SIGNUP_SUCCESS(200,"회원가입을 성공했습니다."),
    UPDATE_SUCCESS(200,"수정 완료했습니다."),
    GET_MEMBER(200,"유저 가져오기 완료됐습니다.");

    private int code;
    private String memssage;
}