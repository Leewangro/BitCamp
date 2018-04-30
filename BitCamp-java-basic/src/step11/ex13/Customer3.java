package step11.ex13;

public class Customer3 {
        // 외부에서 인스턴스 변수에 직접 접근하지 못하도록 막는다
         String name;
         int age;
         int weight;
         int height;
         // 외부에서 인스턴스 변수에 접근을 못하기 때문에 값을 넣거나 조회할 수 없다.
         // 그래서 이를 가능하게 하는 수단/방법(메서드)를 제공해야 한다.
         // 인스턴스 변수 name의 값을 넣는 메서드
         // => 보통 메서드 명은 set으로 시작한다.
         // => 그래서 이 메서드를 "셋터"라고 부른다.
         public void setName(String name) {
             // 이 메서드에서 이름 값이 유효한지 검사한다.
             if (name == null) 
                 this.name = "이름없음";
             return;
         
             if (name.length() < 2 ) {
                 this.name = "이름없음";
             return;
             
             // 이름은 최대 5자만 넣는다.
             this.name = name.substring(0, 5);
             
         }
         
         // 인스턴스 변수 age의 값을 넣는 메서드
         // => 나이 값이기 때문에 유효한 1 ~ 120이다.
         public void setAge(int age) {
             if (age < 0 && age > 120)
                 this.age = 0;
             this.age = age;
             return;
             
         }
         // 인스턴수 변수 weight의 값을 넣는 메서드
         // => 몸무게는 1~200 이다.
         public void setWeight(int weight) {
             if (weight < 1 || weight > 120)
                 this.weight = 0;
             this.weight = weight;
             return;
    }
    // 인스턴스 변수 height의 값을 넣는 메서드
    // => 키의 유효 범위는 1 ~ 300 이다.
         public void setHeight(int height) {
             if (height < 1 || height > 300)
                 this.height = 0;
             this.height = height;
             return;
    }
         
         public String getName() {
             return this.name;
         }
         
         public int getAge() {
             return this.age;
         }

         public int getHeight() {
             return this.height;
         }

         public int getWeight() {
             return this.weight;
         }
}


