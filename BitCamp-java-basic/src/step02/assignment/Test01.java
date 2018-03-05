package step02.assignment;

public class Test01{
    public static void main(String[] args) {
        
        java.util.Scanner grade = new java.util.Scanner(System.in);//이거
        String name;
        int lang,eng,math;
        
        System.out.print("이름?");
        name = grade.nextLine();//이거
       
        
        
        System.out.print("국어?");
        lang = grade.nextInt();
        
        System.out.print("영어?");
        eng = grade.nextInt();
        
        System.out.print("수학?");
        math = grade.nextInt();
        
        int sum = lang+eng+math;
        float ave= sum/3f;
        System.out.println("---------------------");

        System.out.printf("%s %d %d %d %d %.1f",name,lang,eng,math,sum,ave);

    }
}
