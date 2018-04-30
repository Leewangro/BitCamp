// 애노테이션 적용 범위
package step20.ex6;

@MyAnnotation // Oㅔ러
public class MyClass {
    @MyAnnotation int i;//에러
    
    // @Myannotation은 메서드에만 붙일 수 있다.
    @MyAnnotation public void m() {}
}