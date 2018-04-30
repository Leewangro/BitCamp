// 오버라이딩 - 응용 예 : equals
package step11.ex12;

public class Exam03_2 {
    
    //인스턴스 변수는 인스턴스 주소가 있어야 사용가능 하다
    //고로 static이 붙은 Score 클래스를 사용하려면 인스턴스를 선언해야함 new를 사용해서
    static class Member /*extends Object*/ {
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // Object로 부터 상속 받은 equals()메서드를 
        // Member 클래스의 역할에 맞게 재정의해보자!
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Member))
                    return false;
            Member other = (Member)obj;
            
            if(!this.name.equals(other.name))
                return false;
            
            if(this.age != other.age)
                return false;
            
            return true;
        }
    }

    public static void main(String[] args) {
        //Object 클래스?
        //추상화 : 어떤 사물이나 개념을 데이터화 시키는 것.
        Member m1 = new Member("홍길동",20);
        Member m2 = new Member("홍길동",20);
        
        if (m1 == m2) {
            System.out.println("m1 == m2");
        }else {
            System.out.println("m1 != m2");
        }
        System.out.println(m1.toString());
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode());
        System.out.println();
    }
}
// 결론!
// => Object로 부터 상속받은 기본 메서드인 equals()는
//    같은 신스턴스인지를 비교하는 메서드이다.
// => 인스턴스의 데이터가 같은지를 비교하고 싶다면, 이 메서드를 재정의(오버라이딩)해야 한다.
// => 오버라이딩의 예:
//    String, 랩퍼 클래스(Byte, Short, Integer, Long, Float, Double, Boolean, Character)
