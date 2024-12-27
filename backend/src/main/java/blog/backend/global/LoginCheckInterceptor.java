package blog.backend.global;


import blog.backend.domain.member.entity.Member;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginCheckInterceptor implements HandlerInterceptor {

//    @Override//Securityconfig가 대체함.
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        //세션에서 회원 정보 조회
//        HttpSession session = request.getSession();
//        Member member = (Member) session.getAttribute("mySessionId");
//
//        if(member==null){//null 이면 로그인 X
//            return false;
//        }
//        return HandlerInterceptor.super.preHandle(request,response,handler);
//    }
}
