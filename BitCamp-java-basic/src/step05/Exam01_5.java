//흐름 제어문 - else문의 소속
package step05;


public class Exam01_5 {
    public static void main(String[] args) {
       
        int age = 15;

        //else는 가장 가까운if에 소속된다
        //들여쓰기에 속지말라
        if (age >= 19 && age <=70)
            if(age >=70)
                System.out.println("노인");
        else
            System.out.println("미성년");
            //어? 강사님, if문에 블록을 사용하지 않으면
            //오직 한 개의 문장만 온다고 했는데
            //위의 코드를 보면 if(age>19)안에
            //if와 else 두 개의 문장이 있잖아요
            //그럼 컴파일 오류가 발생해야 되는거 아닌가요?
            //=?else문, if없이 단독으로 사용할 수 없다
            //오직 if가 있어야만 사용할 수 있다.
            //그래서 if - else는 한 문장으로 취급한다,.
            //->그런 이유로, 위의 if(age?=70) - else는 한 문장으로 간주한다.
            //굳이 중괄호를 쓸 필요 없다/
    }
    //만약 else문을 첫 째 if문에 소속되게 하고 싶다면
    // 두 번째 if문을 블록으로 묶어라
}