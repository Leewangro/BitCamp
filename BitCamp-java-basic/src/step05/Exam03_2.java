//흐름 제어문 - break와 continue
package step05;

import java.util.Scanner;
//상수를 좀 더 조직적으로 관리하는 방법.
//enum을 사용하여 상수를 정의한다.
   
public class Exam03_2 {
    
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        // 1 ~ 100합은?
        while (count < 100) {
            count++;
            sum += count;     //sum= sum+count;
            
        }
        System.out.printf("cout = %d, sum = %d\n",  count, sum);
        
        System.out.println("--------------------------------------------");
        //continur 사용전
        //1부터 100까지의 짝수의 합은?

        count = 0;
        sum = 0;
        // 1 ~ 100합은?
        while (count < 100) {
            count++;// count++2;
            if(count % 2 == 0){
                sum += count;     //sum= sum+count;
            }
        }
        System.out.printf("cout = %d, sum = %d\n",  count, sum);

        System.out.println("--------------------------------------------");
        //continur 사용후
        //1부터 100까지의 짝수의 합은?

        count = 0;
        sum = 0;
        // 1 ~ 100합은?
        while (count < 100) {
            count++;
            if(count % 2 == 1)
                continue; //다음 문장을 실행하지 말고 즉시 조건 검사로 이동한다.
            sum += count;     //sum= sum+count;
            }
        System.out.printf("cout = %d, sum = %d\n",  count, sum);

        System.out.println("--------------------------------------------");
        //break 사용 전
        //0부터 99까지 카운트를 하는데 단 합은 50까지만 계산한다

        count = 0;
        sum = 0;
        // 1 ~ 100합은?
        while (count < 100) {
            count++;
            
            if(count > 50 ) {
                continue; }
            sum += count;//sum= sum+count;
            }
        System.out.printf("cout = %d, sum = %d\n",  count, sum);


        System.out.println("--------------------------------------------");
        //break 사용 후
        //0부터 99까지 카운트를 하는데 단 합은 50까지만 계산한다

        count = 0;
        sum = 0;
        // 1 ~ 100합은?
        while (count < 100) {
            count++;
            
            if(count > 50 ) 
                break;  //반복문을 나간다.
                sum += count;//sum= sum+count;
            }
        System.out.printf("cout = %d, sum = %d\n",  count, sum);
    }
}
  


