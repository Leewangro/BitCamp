package bitcamp.mvc.web;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

// 모든 페이지 컨트롤러에 대해 조언을 수행하는 클래스 정의
// => 다음 애노테이션을 붙이면 페이지 컨트롤러를 실행할 때 마다 호출될 것이다.
@Controller
public class Exam05_5_GlobalControllerAdvice {
    @InitBinder
    public void initBinder(WebDataBinder binder) {

        System.out.println("Exma05_5_GlobalControllerAdvice.initBinder()");
        
        binder.registerCustomEditor(
                java.sql.Date.class, 
                new PropertyEditorSupport() {
                    @Override
                    public void setAsText(String text) throws IllegalArgumentException {
                        this.setValue(Date.valueOf(text));
                    }
                });
    }
}
