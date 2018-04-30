// Queue : 먼저 들어온 것이 먼저 나가는 구조.
package step12.ex04;

import step12.ex02.LinkedList;

// 큐 사용의 예
// => 인터넷 예약 처리할 떄
// => single-thread 기반 node 서버의 요청 처리
// => 이벤트 처리(이벤트가 발생된 순서대로 처리)
public class Queue extends LinkedList{
    // 맨 뒤에 값을 붙인다 
    public void offer(Object value) {
        this.add(value);
    }
    //맨 앞의 갚을 꺼낸다
    public Object poll() {
        return this.remove(0);
    }
}
