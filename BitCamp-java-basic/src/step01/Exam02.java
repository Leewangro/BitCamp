//main()
package step01;
public class Exam02{
    public static void main(String[] args) {
    System.out.println("src/Step02/Exam02.java");       
    }
}

//명령창에서 JVM이 바로 실행할 수 있는 클래스는
//main()명령어 블록을 가진 클래스이다.
//JVM이 클래스를 실행하는 과정
// 1) 실행할 클래스 파일을 CLASSPATH에 등록된 폴더에서 찾는데
// 2) 유효한 바이트코드인지 검사한다.
// 3) 메모리에 바이트코드를 적재(load)한다
// 4) public static void main()블럭을 찾는다
// 5) main 블럭에 들어잇는 코드를 실행한다.