// URL(Uniform Resource Locator) - Windeows OS의 파일 경로
package step16.ex2;

import java.net.URL;

public class Exam05 {
    public static void main(String[] args)throws Exception {
        // 로컬 자원의 위치를 URL로 표현하는 방법
        URL url = new URL("file://c:/workspace/java-basic/src/Hello.java");
        
        //URL 분석
        System.out.printf("프로토콜 : %s\n",url.getProtocol());
        System.out.printf("서버주소 : %s\n",url.getHost());
        System.out.printf("포트번호 : %d\n",url.getPort());
        System.out.printf("자원경로 : %s\n",url.getPath());
        System.out.printf("쿼리스트링 : %s\n",url.getQuery());


        // 웹 브라우저에서는 포트번호를 생략하면 80번으로 간주한다.
    }
}
