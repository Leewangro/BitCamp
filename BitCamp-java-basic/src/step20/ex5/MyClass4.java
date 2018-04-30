// 애노테이션 프로퍼티 - 배열 값 지정
package step20.ex5;

                // 배열 값을 지정할 때 중괄호 사용
@MyAnnotation3(v1 = {"홍길동", "임꺽정", "유관순"},
               v2 = {1000,2000},
               v3 = {1.11f , 2.22f}) // OK! value 프로퍼티는 이름 생략 가능!
public class MyClass4 {
    
}