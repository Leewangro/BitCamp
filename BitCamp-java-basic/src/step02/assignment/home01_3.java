package step02.assignment;

// 5단계: 
public class home01_3 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String[] name= new String[6];
        int[] kor=new int[6];
        int[] eng=new int[6];
        int[] math=new int[6];
        int[] sum=new int[6];
        float[] average=new float[6];

         for(int i=0 ; i<5 ; i++){
            System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();

            sum[i] = kor[i] + eng[i] + math[i];
            average[i] = sum[i] / 3;

           
         }
         System.out.println("------------------------------");
         for(int i=0 ; i<5 ; i++){

           
            System.out.print(name[1]);
            System.out.print(" ");
            System.out.print(kor[1]);
            System.out.print(" ");
            System.out.print(eng[1]);
            System.out.print(" ");
            System.out.print(math[1]);
            System.out.print(" ");
            System.out.print(sum[1]);
            System.out.print(" ");
            System.out.print(average[1]);
            System.out.println();

            System.out.print(name[2]);
            System.out.print(" ");
            System.out.print(kor[2]);
            System.out.print(" ");
            System.out.print(eng[2]);
            System.out.print(" ");
            System.out.print(math[2]);
            System.out.print(" ");
            System.out.print(sum[2]);
            System.out.print(" ");
            System.out.print(average[2]);
            System.out.println();

            System.out.print(name[3]);
            System.out.print(" ");
            System.out.print(kor[3]);
            System.out.print(" ");
            System.out.print(eng[3]);
            System.out.print(" ");
            System.out.print(math[3]);
            System.out.print(" ");
            System.out.print(sum[3]);
            System.out.print(" ");
            System.out.print(average[3]);
            System.out.println();

            System.out.print(name[4]);
            System.out.print(" ");
            System.out.print(kor[4]);
            System.out.print(" ");
            System.out.print(eng[4]);
            System.out.print(" ");
            System.out.print(math[4]);
            System.out.print(" ");
            System.out.print(sum[4]);
            System.out.print(" ");
            System.out.print(average[4]);
            System.out.println();

            System.out.print(name[5]);
            System.out.print(" ");
            System.out.print(kor[5]);
            System.out.print(" ");
            System.out.print(eng[5]);
            System.out.print(" ");
            System.out.print(math[5]);
            System.out.print(" ");
            System.out.print(sum[5]);
            System.out.print(" ");
            System.out.print(average[5]);
            System.out.println();
         }
        
    }
}