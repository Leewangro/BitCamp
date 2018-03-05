//변수 - 다양한 변수 선언 방법
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam03_2{
    public static void main(String[] args) {
       //콤마를 이용하여 여러개의 변수를 한 번에 선언할 수 있다.
        int v1,v2,v3;//4바이트 정수값을 담을 메모리를 3개 준비시킨다.
        boolean b1,b2,b3;//논리 값을 담을 메모리를 3개 준비시킨다.
        //논리 값은 true, false 두 개만 있다.
        //메모리에 저장될 때 true 는 1, false는 0 값으로 저장된다.
        //


    }
}

//변수 선언
//-값을 저장할 메모리를 준비시키는 명령.
//문법
//메모리종류 별명;
//메모리 종류
//1)primitive data type(원시 데이터 타입)
//  자바에서 기본으로 제공하는 메모리 종류
//-정수
// -byte : 1byte (-128~127)
// -short : 2byte (-32768~32767)
// -int : 4byte (약 -21억~ 21억)
// -long : 8byte (약 -922경 ~ 922경)
//-부동소수점
// -float : 4byte(유효자릿수 7자리)
// -double : 8byte(유효자릿수 15자리)
//-문자
// -char : 2byte
//-논리값
// -boolean : JVM에서 4byte메모리를 사용한다.
//2) reference(레퍼런스)
//  -데이터가 저장된 메모리의 주소를 저장하는 메모리
//-문자열(주소)
// -string : 문자열이 저장된 주소를 저장한다.