//산술 연산자 : 암시적 형변환
package step04;

public class Exam01_5 {
public static void main(String[] args) {
    byte b =1;
    short s = 2;
    int i = 3;
    long l = 4;
    float f = 5.5f;
    double d = 6.6;
    char c = 7;
    boolean bool = true;
    //확인 byte + byte = int
    //연산 수행전에 byte값이 int로 암시적 형변환 된다
    //byte r1 = b + b; //cperror

    //short + short = int
    //연산을 하기전에 short 값이 int로 암시적 형변환 된다.
    //short r2 = s + s;

    //byte + short = int
    //byte와 short 값은  int로 암시적 형변환 된다

    //short r3 = b + s;

    //byte + int = int
    //byte가 int로 암시적 형변환 한 다음에 연산한다.

    int r4 = b + s;

    int r5 = b + i;
    
    //int + long = long
    // int가 long으로 암시적 형변환 한 이후에 연산을 수행한다.
   // int r6 = i +l;

    //long = float = float
    //long이 float으로 암시적 형변환 한 후에 연산을 수행한다
    //long r7 = l + f;

    //int + float = float
    //정수 타입의 값과 부동소수점 타입의 값을 연산하면
    //정수 타입의 값이 암시적 형변환을 통해 부동소수점으로 바뀐다.
    //정수 + float = float이다
    //int r8 = i + f;

    //float + double = double
    //float r9 = f+d; //컴파일 오류
    
    //byte + short + int +long +float +double = double
//    long r10 = b+s+i+l+f+d;//멐파일에러
   


    //산술 연산자는 정수 타입과 부동소수점 타입에 대해서만
    //실행할 수 있다.
        //int r12 = bool + i //컴파일 오류
    }
}
//결론
//-연산은 항상 같은 타입끼리만 가능하다.
//-그래서 다른 타입끼리 연산을 할 때는 둘 중 한개의 타입을 다른 타입으로
// 바꿔야 한다.
//-내부적으로 타입을 바꾸는 것을 내부적인 규칙에 따라 자동으로 처리한다고 해서
//-"암시적 형변환"(implicirt type conversion)이라 부른다

//-암시적 형변환 규칙
//다음과 같이 오른쪽 타입의 값으로 자동 변환시킨다.
//byte , short -> int -> long -> float - > double

//주의
//-정수와 부동소수점에 대해서만 암시적 형변환이 일어난다.
//그 외 다른 타입은 불가능하다.