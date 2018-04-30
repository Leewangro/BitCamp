// HTTP 클라이언트 만들기
package step23.ex7;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

// HTTP 요청 프로토콜
// --------------------------------------------
// GET [자원주소] HTTP/1.1 (CRLF)
// Server: [서버주소] (CRLF)
// (CRLF)
// --------------------------------------------
//
// 프로토콜
// => 클라이언트/서버 간의 통신 규칙
// => 데이터를 주고 받는 규칙.
//
public class HttpClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("www.itworld.co.kr", 80);
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        out.println("GET /news/news_view.asp?artice_id=20180327140956&lo=z35 HTTP/1.1");
        out.println("HOST: www.itworld.co.kr");
        out.println();
        
        while(true) {
            try {
                System.out.println(in.nextLine());
            } catch (Exception e) {
                break;
            }
            
        }
        out.close();
        in.close();
        socket.close();
        
    }
}
