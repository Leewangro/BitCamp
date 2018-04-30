// 애노테이션 프로퍼티 - 선택 프로퍼티
package step20.ex3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//애노테이션의 유지 정책을 저장하지 않으면 기본이 CLASS이다.
@Retention(RetentionPolicy.RUNTIME) 
public @interface MyAnnotation2 {
    String value() default "홍길동"; 
    // default 값을 지정하면 
    // 애노테이션을 사용할 때  값을 지정하지 않아도 된다.
}
