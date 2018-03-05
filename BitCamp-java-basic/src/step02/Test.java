package step02;

public class Test{
    public static void main(String[] args) {
        int a,b;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("간단한 사칙연산 프로그램");
        System.out.println("원하시는 연산을 입력해 주세요.");
        System.out.println("곱셈은 0 덧셈은 1 빼기는 2 나누기는 3");

        int sem = sc.nextInt();
        
        switch (sem) {
        
        case 0 : System.out.println("숫자를 입력하세요.");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%d * %d = %d",a,b,a*b);
        break;
        
        case 1 : 
        System.out.println("숫자를 입력하세요.");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%d + %d = %d",a,b,a+b);
        break;

        case 2 : 
        System.out.println("숫자를 입력하세요.");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%d - %d = %d",a,b,a-b);
        break;

        case 3 : 
        System.out.println("숫자를 입력하세요.");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%d / %d = %d",a,b,a/b);
        break;
    }

        
        

    }
}