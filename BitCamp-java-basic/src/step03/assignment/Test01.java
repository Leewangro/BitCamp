package step03.assignment;

public class Test01{
    public static void main(String[] args) {
        java.util.Scanner grade = new java.util.Scanner(System.in);


      //  System.out.println("입력: ");
        

        class Score{
            String name;
            int kor;
            int eng;
            int math;
            int sum= kor+eng+math;
            float aver=sum/3;

        }
        
        Score[] arr=new Score[3];
            

        for(int i=0 ;i<arr.length;i++ ){

            arr[i] = new Score(); 
        }

        arr[0].name="홍길동";
        arr[1].name="임꺽정";
        arr[2].name="유관순";

        for(int i=0;i<3;i++){

            System.out.println("이름?");
            arr[i].name=grade.next();
            arr[i].kor=grade.nextInt();
            arr[i].eng=grade.nextInt();
            arr[i].math=grade.nextInt();
            arr[i].sum=arr[i].kor + arr[i].eng + arr[i].math;
            arr[i].aver=arr[i].sum / 3;
    
        }
        System.out.println("-------------------------------------------------------------------------------");
        for(int i=0; i < arr.length; i++){
            System.out.printf("%s %d %d %d %d %.1f\n",arr[i].name, arr[i].kor, arr[i].eng, arr[i].math, arr[i].sum, arr[i].aver);
           
             };
    }
}