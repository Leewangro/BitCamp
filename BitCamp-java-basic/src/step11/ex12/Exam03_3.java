// 오버라이딩 - 응용 예 : equals
package step11.ex12;

public class Exam03_3 {
    
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
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println( s1== s2);
        System.out.println( s1.equals(s2));
         // String 클래스에서 equals()를 오버라이딩 했기 때문에
        // s1.equals(s2)의 결과가 true가 나온 것이다
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println( sb1== sb2);//false
        System.out.println( sb1.equals(sb2));//false
        
        // sb1.equals(sb2)의 리턴 값은 false이다.
        //이유?
        //StringBuffer는 Object로 부터 상속받은 equals()를 오버라이딩 하지 않았다.
        // 그래서 Object의 equals()가 호출된 것이다.
        // Object의 equals()는 데이터가 같은지를 비교하는 것이 아니라
        // 인스턴스가 같은지를 비교한다.
    }
}
