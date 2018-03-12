//흐름 제어문 - 조건문 if에 여러 문장을 묶기
package step05;

public class Exam01_2 {
    public static void main(String[] args) {
        int age = 17;
        
        // 1)  if(조건) { 문장1; 문장2;}
        //      조건이 참일 때 여러 개의 문장을 실행하고 싶다면
        //      중괄호를 사용하여 묶어라.
        // -> 블록으로 묶지 않으면 첫 번째 문장만 if문에 종속된다
        // -> 들여쓰기는 문법에 영향을 끼치지 않는다.
        if (age >= 19) 
            System.out.println("정호의 성인일기.avi"); // 이 문장만 if에 소속된다.
            System.out.println("정호는 군대간다.avi");
            System.out.println("정호는 노예다.avi");
            System.out.println("정호는 에혀...avi");
        
        System.out.println("------------------------------");
        if (age >= 19){ //여러 문장을 if문에 종속시키고 싶으면, 블록을 사용하라
            System.out.println("정호의 성인일기.avi");
            System.out.println("정호는 군대간다.avi");
            System.out.println("정호는 노예다.avi");
            System.out.println("정호는 에혀...avi");
            
        }
    }
}