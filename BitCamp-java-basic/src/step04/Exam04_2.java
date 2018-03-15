// 비트 이동 연산자 : >>, >>>, <<
package step04;

public class Exam04_2 {
    public static void main(String[] args) {
        int i = 0b01101001;
        System.out.println(i);
        System.out.println(i >> 1); // 00110100 | 1 = > 52
        System.out.println(i >> 2); // 00011010 | 0 = > 26
        System.out.println(i >> 3); // 00001101 | 0 = > 13
        System.out.println(i >> 4); // 00000110 | 1 = > 6
        
        // 오른쪽으로 이동 후,
        // 오른쪽 빈자리 : 원래 숫자와 같은 부로 값을 채운다.
        //                양수면0, 음수면 1을 채운다.
        // 왼쪽 경계를 넘어간 비트는 : 짜른다.

        i = 0b11111111_11111111_11111111_10101001;
        System.out.println(i >> 1); 
        // i = 0b11111111_11111111_11111111_11010100; -87
        System.out.println(i >> 2);
        // i = 0b11111111_11111111_11111111_11101010; 43.5 대신 더 작은 정수 -44값
        System.out.println(i >> 3);
        // i = 0b11111111_11111111_11111111_11101010;
    }
}