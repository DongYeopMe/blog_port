package blog.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MemberController {

    @GetMapping("/api/hello")
    public String hello(){
        return "hi, 데이터 보내기";
    }
}
