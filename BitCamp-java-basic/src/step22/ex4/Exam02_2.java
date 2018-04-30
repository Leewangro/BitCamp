// 객체 읽기 - 파일이 데이터를 읽어 인스턴스로 만들기 
package step22.ex4;


public class Exam02_2 {

    public static void main(String[] args) throws Exception {
        DataInputStream in = new DataInputStream("temp/test4.data");
        
        Member member = null;
        
        member = new Member();
       
        member.name = in.readUTF();
        
        member.age = in.readInt();
        
        member.gender = in.readBoolean();
        
        
        in.close();
        
        System.out.printf("%s\n", member);
    }
}
