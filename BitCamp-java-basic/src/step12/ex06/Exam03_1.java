// HashMap vs Hashtable
package step12.ex06;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Exam03_1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(null, "홍길동"); // null을 key로 사용할 수 있다.
        map.put("s01",null); // value가 null이 될 수 있다. 
                            // 동기화를 지원하지 않는다.
                            // 멀티스레드가 동시에 사용할 때 문제가 발생할 수 있다.
                            // => 속도가 빠르다.
        Hashtable table = new Hashtable();
        table.put(null, "홍길동"); // null을 key로 사용할 수 없다.
        map.put("s01",null); // value가 null이 될 수 없다.
                             // 동기화 지원
    }

}