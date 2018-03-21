// Singleton 패턴 적용 후
package step09.singleton;


public class Car2 {
    // Car2 객체를 생성하면 다음 스태틱 변수에 보관해둔다.
    private static Car2 instance;
    // 외부에서 생성자를 호출하지 못 하도록 private으로 접근을 제한한다.
    private Car2() {
        System.out.println("Car2()");
    }

    public static Car2 getInstance() {    
        // return new Car2(); //객체를 생성한 것을 무조건 리턴함
        if (instance == null) 
            instance = new Car2();
            return instance;
        }

    
}
