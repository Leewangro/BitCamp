package step02.assignment;

public class arrtest{
    public static void main(String[] args) {
        
        java.util.Scanner grade = new java.util.Scanner(System.in);
        /*배열 선언의 4가지 방법
      int[] arr1 = new int[5];
      int arr2[] = new int[] {0, 0, 0, 0, 0};
      int[] arr3 = {0, 0, 0, 0, 0};
      int[] arr4;
      arr4 = new int[]{0, 0, 0, 0, 0};
      */
       String[] name = new String[5];
       int[] lang=new int[5];
       int[] eng=new int[5];
       int[] math=new int[5];
       int[] sum=new int[5];
       float[] ave=new float[5];

       for(int i=0;i<5;i++){

        System.out.println("이름?");
        name[i]=grade.next();
        lang[i]=grade.nextInt();
        eng[i]=grade.nextInt();
        math[i]=grade.nextInt();
        

        sum[i]=lang[i]+eng[i]+math[i];
        ave[i]=sum[i]/3;


       }
       for(int i=0;i<5;i++){
           System.out.printf("%s %d %d %d %d %.1f \n",name[i],lang[i],eng[i],math[i],sum[i],ave[i]);
       }
    }
}