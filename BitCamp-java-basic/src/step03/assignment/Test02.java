package step03.assignment;

import step03.Score;


public class Test02{
    public static void main(String[] args) {
        java.util.Scanner grade = new java.util.Scanner(System.in);


        //Score  메모리(인스턴스)의 주소를 저장할 변수: 레퍼런스 준비
        step03.Score[] scores= new step03.Score[3];
        //입력 값을 저장할 Score 메모리를 준비한다.
        for(int i=0;i<scores.length;i++){
        scores[i] = new step03.Score();
        
        System.out.println("입력: ");
        scores[i].name=grade.next();
        scores[i].kor=grade.nextInt();
        scores[i].eng=grade.nextInt();
        scores[i].math=grade.nextInt();
        scores[i].sum=scores[i].kor+scores[i].eng+scores[i].math;
        scores[i].aver=scores[i].sum / 3;
        }

        System.out.println("------------------");
        for(int i =0 ; i< scores.length; i++){
            System.out.printf("%s %d %d %d %d %.3f\n",scores[i].name,scores[i].kor,scores[i].eng,scores[i].math,scores[i].sum,scores[i].aver);
        }
    }

}