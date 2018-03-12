package step02.assignment;

public class Test01{
    public static void main(String[] args) {
        
        java.util.Scanner grade = new java.util.Scanner(System.in);
        String name1,name2,name3,name4,name5;
        int lang1,eng1,math1,lang2,eng2,math2,lang3,eng3,math3,lang4,eng4,math4,lang5,eng5,math5;
        int i;
        
       
        System.out.print("이름?");
        name1 = grade.nextLine();
        //System.out.println(name);
        //grade.nextLine();
        System.out.print("국어?");
        lang1 = grade.nextInt();
  
        //System.out.println(lang);
        //이전에 국어 점수를 입력받을때 줄바꿈 코드는
        //nextInt()메서드에서 버린다.
        System.out.print("영어?");
        eng1 = grade.nextInt();

        //System.out.println(eng);
        System.out.print("수학?");
        math1 = grade.nextInt();
   
        //System.out.println(math);
        int sum1 = lang1+eng1+math1;
        float ave1= sum1/3f;

        
        System.out.print("이름?");
        name2 = grade.nextLine();
        System.out.print("국어?");
        lang2 = grade.nextInt();
        System.out.print("영어?");
        eng2 = grade.nextInt();
        System.out.print("수학?");
        math2 = grade.nextInt();
        grade.nextLine();
        int sum2 = lang2+eng2+math2;
        float ave2= sum2/3f;

        System.out.print("이름?");
        name3 = grade.nextLine();
        System.out.print("국어?");
        lang3 = grade.nextInt();
        grade.nextLine();
        System.out.print("영어?");
        eng3 = grade.nextInt();
        grade.nextLine();
        System.out.print("수학?");
        math3 = grade.nextInt();
        grade.nextLine();
        int sum3 = lang3+eng3+math3;
        float ave3= sum3/3f;

        System.out.print("이름?");
        name4 = grade.nextLine();
        System.out.print("국어?");
        lang4 = grade.nextInt();
        grade.nextLine();
        System.out.print("영어?");
        eng4 = grade.nextInt();
        grade.nextLine();
        System.out.print("수학?");
        math4 = grade.nextInt();
        grade.nextLine();
        int sum4 = lang4+eng4+math4;
        float ave4= sum4/3f;

        System.out.print("이름?");
        name5 = grade.nextLine();
        System.out.print("국어?");
        lang5 = grade.nextInt();
        grade.nextLine();
        System.out.print("영어?");
        eng5 = grade.nextInt();
        grade.nextLine();
        System.out.print("수학?");
        math5 = grade.nextInt();
        grade.nextLine();
        int sum5 = lang5+eng5+math5;
        float ave5= sum5/3f;

        System.out.println("---------------------");

        System.out.printf("%s %d %d %d %d %.1f",name1,lang1,eng1,math1,sum1,ave1);
        System.out.println("");
        System.out.printf("%s %d %d %d %d %.1f",name2,lang2,eng2,math2,sum2,ave2);
        System.out.println("");
        System.out.printf("%s %d %d %d %d %.1f",name3,lang3,eng3,math3,sum3,ave3);
        System.out.println("");
        System.out.printf("%s %d %d %d %d %.1f",name4,lang4,eng4,math4,sum4,ave4);
        System.out.println("");
        System.out.printf("%s %d %d %d %d %.1f",name5,lang5,eng5,math5,sum5,ave5);
        System.out.println("");
       
    }
}
