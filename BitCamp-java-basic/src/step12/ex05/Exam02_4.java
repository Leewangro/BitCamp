// java.util.LinkedList 사용하기
package step12.ex05;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Exam02_4 {

    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("eee");

        ArrayBlockingQueue queue = new ArrayBlockingQueue(100);
        queue.add(s1);
        queue.add(s2);
        queue.add(s3);
        queue.add(s4);
        queue.add(s5);


        Iterator 컬렉션에서값을꺼내주는객체 = queue.iterator();

        while (컬렉션에서값을꺼내주는객체.hasNext()) {
            System.out.print(컬렉션에서값을꺼내주는객체.next() + ", ");
        }
        System.out.println();

    }

}
