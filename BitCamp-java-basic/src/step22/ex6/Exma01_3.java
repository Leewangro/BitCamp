// 메모리에서 데이터를 읽기 - 읽은 데이터를 Member 객체에 저장한다.
package step22.ex6;

public class Exma01_3 {

    public static void main(String[] args) throws Exception {
        byte[] buf = {0x0b, 0x41, 0x42, 
                (byte)0xea, (byte)0xb0, (byte)0x80, 
                (byte)0xea, (byte)0xb0, (byte)0x81, 
                (byte)0xea, (byte)0xb0, (byte)0x84, 
                0x00, 0x00, 0x00, 0x1b, 0x01};
        
        ByteArrayDataInputStream in = new ByteArrayDataInputStream(buf);
        
        Member member = new Member();
        
        member.name =  in.readUTF();
        member.age = in.readInt();
        member.gender = in.readBoolean();
        
        in.close();
        
        System.out.println(member);
        
        // 문제?
        // => ByteArrayDataInputStream과 DataInputStream 클래스는
        //    생성자를 빼고 나머지 코드가 모드 같다.
        // => 안타깝게도 DataInputStream의 코드를 복사하지 않고
        //    재사용하는 방법이 없다.
        //    이것이 상속으로 기능을 확장했을 때의 한계이다.
        // => 해결책?
        //    바이트 값을 읽어 String, int, boolean값으로 바꾸는 코드를 
        //    Accessory  처럼 붙였다 뗏다 가능하게 만들라.
        
    }

}