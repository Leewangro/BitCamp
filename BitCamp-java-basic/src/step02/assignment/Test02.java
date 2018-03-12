package step02.assignment;

public class Test02{

    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String name;
        int lang,eng,math;

        System.out.print("이름:");
        System.out.println(keyScan.nextLine());
    
        System.out.print("국어:");
        System.out.println(keyScan.nextLine());
        
        System.out.print("영어:");
        System.out.println(keyScan.nextLine());

        System.out.print("수학:");
        System.out.println(keyScan.nextLine());

        System.out.print("-----------------------:");
        System.out.println(keyScan.nextLine());

        System.out.print(name);
        System.out.print("");

        System.out.print(lang);
        System.out.print("");
        
        System.out.print(eng);
        System.out.print("");
        
        System.out.print(math);
        System.out.println();
        

    }
}