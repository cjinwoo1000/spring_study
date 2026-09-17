//인텔라이져 불러오기
package com.example.spring_web;

//매핑도구
import org.springframework.web.bind.annotation.GetMapping;
//웹요청 처리도구
import org.springframework.web.bind.annotation.RestController;

//웹요청 처리
@RestController
//누구나 볼수있는 public틀
public class HelloController {
    // (/hello)로 들어 왔을때 요청을 처리
    @GetMapping("/hello")

    //실제 실행 함수11
    public String hello() {
        return "안녕하세요! 스프링 첫 화면입니다.";
    }
}
