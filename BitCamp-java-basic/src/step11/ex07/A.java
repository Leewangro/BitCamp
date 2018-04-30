package step11.ex07;

public class A {
    int v1;
    
    // A 클래스는 기본 생성자가 없다.
    // => int 값을 반는 생성자만 있다.
    A(int value){
        this.v1 = value; //이건 어디다 쓰는 물건인고?
        System.out.println("A() 생성자!");
    }
   
}
