//클래스 블록의 공개 여부
public class Exam03 {}
class F {}

//클래스 블록에 있는 명령의 사용범위를 조정할 수 있다.
//public : 완전공개
//아무것도 안 주는것(default) : 같은 공간(packige)에 소속된 클래스에서만 접근가능
//주의
// * public클래스는 클래스를 저장할 때 반드시 파일명도 클래스 이름과 같아야한다.
// * 따라서 한 파일에 두 개 이상의 public 클래스를 만들 수 없다.