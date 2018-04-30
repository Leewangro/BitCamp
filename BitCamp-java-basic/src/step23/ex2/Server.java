package step23.ex2;

import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        Socket socket = new Socket("localist",8080);
        
        System.out.println();
        
        socket.close();
    }
}
