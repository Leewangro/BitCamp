package step07;
// 사용자 정의 데이터 타입 설계
    // = > 학생의 성적 데이터를 담을 새로운 구조의 메모리를 설계한다.

public class Score {
    // 인스턴스 변수
    // => new 명령으로 생성되는 변수이다.
    // => 데이터를 개별적으로 다루고 싶을 때 인스턴스 변수로 선언한다.
    //      즉, new 명령을 사용하면 여러 명의 학생 성적 데이터를 개별적으로 다룰 수 있도록
    //      메모리를 생성한다.
    public String name;
    public int age;
    public int kor;
    public int eng;
    public int math;
    public float average;
    public int sum;
}
