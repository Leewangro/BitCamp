package step05;

public class Exam01_1 {
    public static void main(String[] args) {
        int age = 17;
        
        // 1)  if(조건) 문장;
        if (age >= 19) System.out.println("정호의 성인일기.avi");
        
        //=> 문장을 다른 줄에 놓는 경우가 많다.
        if (age >= 19) //if문에 빈 문장을 넣을 수 있다.
            System.out.println("정호의 성인일기.avi");
            //이런 경우 개발자가 오해할 수 있다.
        
    }
}