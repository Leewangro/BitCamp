package step13.ex02;

public class Exam01_2 {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(new Member("홍길동",20));
        list.add(new Member("임꺽정",16));
        list.add(new Member("유관순",25));
        
        // 값을 꺼내 사용하면 항상 형변환해야 한다.
        for(int i = 0; i < list.size(); i++) {
            Member member = (Member) list.get(i);
            System.out.printf("%s(%d)\n",member.name, member.age);
        }
    }

}
