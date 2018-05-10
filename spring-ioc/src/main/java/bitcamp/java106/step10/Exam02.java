// 클래스를 이용하여 스프링 설정하기 - @Configuration 애노테이션
package bitcamp.java106.step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam02 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = 
                new AnnotationConfigApplicationContext("bitcamp.java106.step10");
        
        BeanUtils.printBeanNames(iocContainer);
        
    }

}

