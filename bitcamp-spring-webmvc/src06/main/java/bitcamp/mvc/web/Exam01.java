package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("web.HelloController")
public class Exam01 {
    
    @RequestMapping("/exam01/m1")
    @ResponseBody // 리턴 값이 JSP View URL이 아니라 컨텐트임을 가리킨다.
    public String m1() {
        return "Hello";
    }
}