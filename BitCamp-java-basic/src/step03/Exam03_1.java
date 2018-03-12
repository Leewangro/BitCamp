//레퍼런스와 인스턴스 - 가비지
package step03;

public class Exam02_1{
    public static void main(String[] args) {
        //여러 개의 인스턴스 주소 저장하기

        class Score{ 
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;

        }

        //Score 레퍼런스 선언
      Score s1,s2,s3;
      

      //인스턴스를 만들어 그 주소를 레퍼런스에 저장한다.
      s1=new Score();
        
      //새 인스턴스를 만들어 새로운 주소를 만든다
      s1=new Score();
      //그러면 기존에 들어 있던 주소는 값이 바뀐다.
      //주소를 잃어버려 사용할 수 없는 메모리를
      //가비지라 부른다
     
    }
}