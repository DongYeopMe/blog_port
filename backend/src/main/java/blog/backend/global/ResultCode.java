package blog.backend.global;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    //멤버
    SIGNUP_SUCCESS(200,"회원가입을 성공했습니다."),
    UPDATE_SUCCESS(200,"수정 완료했습니다."),
    DELETE_SUCCESS(200,"회원 삭제 완료"),
    GET_MEMBER(200,"유저 가져오기 완료됐습니다."),

    POSTING_SUCCESS(200,"포스팅 완료했습니다."),
    GET_POST_SUCCESS(200,"게시글 가져오기 완료됐습니다." ),
    GET_POSTS_SUCCESS(200,"게시글 페이지 가져오기 완료됐습니다." ),
    POST_DELETE_SUCCESS(200,"게시글 정상적으로 삭제 완료되었습니다." ),

    SCHEDULE_CREATE_SUCCESS(200,"일정 추가 성공했습니다."),
    SCHEDULE_EDIT_SUCCESS(200,"일정 수정 성공했습니다."),
    GET_SCHEDULES_SUCCESS(200,"일정 가져오기 성공했습니다.");



    private int code;
    private String memssage;
}