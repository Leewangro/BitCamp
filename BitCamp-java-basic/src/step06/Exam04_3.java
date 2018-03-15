// 메서드 : 인스턴스와 Heap 메모리 영역
package step06;


class MyObject{
    int a;
    int b;
}

public class Exam04_3 {

    
    static MyObject getMyObject() {
        // Exam03_3.java 에 정의된 MyObject사용
        MyObject ref = new MyObject();
        ref.a = 100;
        ref.b = 200;

        return ref;
    }

    public static void main(String[] args) {
        MyObject ref;
        ref = getMyObject();

        System.out.println(ref.a);
        System.out.println(ref.b);
    }
}
// 1) main() 호출
//  => JVM Stack: args, ref 변수 생성
// 2) getArray() 호출
//  => JVM Stack: ref 변수 생성
//  => Method Area : MyObject
//  => Heap: MyObject 의 인스턴스 생성
// 3) getMyObject() 호출 끝
//  => JVM Stack: getArray() 관련 메모리 (arr) 변수 제거
//  => new int[] 배열 주소 리턴
// 4) main() 호출 끝
//  =>JVM Stack: main() 관련 메모리 제거
// 5) JVM 종료
//  => JVM이 사용한 모든 메모리(Method Area,JVM Stack,Heap)등 제거