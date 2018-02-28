//주석

/** javadoc 주석
 * ->소스 파일에서 추출하여 html 문서를 만들 때 사용하는 주석이다 
 */
package step01;
public class Exam03{
    @Override
    public String toString(){
        return "Exam03";
    }
    //애노테이션
    //->@이름 형태로 된 주석이다.
    //->컴파일이나 JVM에게 특별한 명령을 전달할 때
    //  사용되는 아주 특별한 주석이다.
    //->컴파일한 후에도 .class파일에 존재할 수 있다.    

    /**
     * 변수 선언 말에 설명을 붙여 놓으면
     * 나중에 html 문서를 만들 때 추출할 수 있다.
     */

     /**
      * 메서드에 대한 설명을 여기에 붙여 놓으면 나중에 html 문서를 만들 대 추출할 수 있다.
      */
    public static void main(String[] args) {
    System.out.println("src/Step02/Exam02.java");       
    //한줄주석
    //줄이 끝날 때 까지 사용됨
    /*여러줄 주석
    주석이 끝날 때 까지 사용됨 
    */ 
    }
}

//주석
// -> 소스코드에 대한 설명어
// 소스 코드를 해석하는 데 돕기 위해 작성한다.
// -> 컴파일하면 제거된다.
// 즉, .class파일에는 존재하지 않는다