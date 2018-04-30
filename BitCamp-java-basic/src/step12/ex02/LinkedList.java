package step12.ex02;

public class LinkedList {
    
    // 값을 저장할 바구니 클래스를 만든다.
    // 그 클래스는 LinkedList에서만 사용할 것이기 때문에
    // 일반적인 클래스인 패키지 멤버 클래스로 정의하지 않고 
    // LinkedList 안에 정의한다. 
    // 이렇게 클래스 안에 정의된 클래스를 "중첩 클래스(nested class)" 또는
    // "내부 클래스(inner class)"라고 부른다.
    
    protected class Bucket { 
        // 이 클래스의 역할은 기차에서 사람이나 물건을 싣는 객차의 역할을 수행한다.
        public Object value; // 이 변수에 값을 저장한다.
        public Bucket next; // 이 변수에는 다음 객차 주소를 저장한다.
        public Bucket prev; // 이 변수에는 이전 객체 주소를 저장한다.
    }
    
    protected Bucket head; // 리스트에서 맨 앞 객차의 주소를 저장하는 인스턴스 변수
    protected Bucket tail; // 리스터에서 맨 뒤 객차의 주소를 저장하는 인스턴스 변수
    
    public LinkedList() {
        // LinkedList를 만들면 일단 맨 앞에 있는 빈 객차를 준비한다.
        head = new Bucket();
        tail = head;
        // 처음 만드는 리스트(버킷)에서는 리스트의 상태가 1개의 객체만 존재하기에  헤드와 테일의 주소가 같다. 1개이기 떄문에!!!!
    }

    public void add(Object value) {
        // 맨 끝 객차에 짐을 싣는다. -> 현재의 tail은 처음만든 객체 즉,헤드이자 테일인 객체인데 데이터가 존재하지 않고 메모리만 존재하는 
                                // 상태이다 그 객체에다가 생성자의 매개변수를 통해 받아온 데이터를 넣어준다.
        tail.value = value;
        // 새 객차를 만들어 맨 뒤에 붙인다.
        Bucket bucket = new Bucket();
        tail.next = bucket; //현재 끝의 다음을 새로운 버킷에다가 연결시켜라
        // 새 객차에 이전 객차의 주소를 저장한다.
        bucket.prev = tail;
        
        // 새로 붙인 객체를 맨 끝 객체로 처리한다.
        tail = bucket;
        
        
    }

    public Object get(int i) {
        Bucket cursor = head;
        int count = 0;
        
        while (cursor != tail) { //커서와 테일이 같으면 리스트의 끝위치에 도달했다는 뜻이므로 탈출하겠다 이뜻임.
            if (count == i) 
                return cursor.value; // 해당 커서의 객체에 존재하는 데이터 값을 반환해라
            count++;
            cursor = cursor.next; //현재 찾는 커서의 위치가 테일의 위치와 같아지면 반복문을 끝내라
        }
        return null;
    }

    public int size() {
        Bucket cursor = head;
        int count = 0;
        
        while (cursor != tail) {
            count++;
            cursor = cursor.next; // 끝에 도달할떄까지 커서를 계속 next해서 테일을 만날때까지 증가시킨 다음 만나면 
                                  //카운트 즉 테일의 위치를 반환해라
        }
        return count;
    }

    public Object remove(int i) {
        Bucket cursor = head;
        
        if (i == 0) { // i는 인덱스의 개념으로 보고 헤드는 0번부터 시작하니 헤드가 0번 배열이라고 보면 된다.
            if (head == tail) // 처음 객체를 제외하고 다른 객체는 존재하지 않기 때문에 지울것이 없음
                return null;    // heda = null 로 하지 않고 null을 반환 하는 이유는 처음에 존재하는 객체 하나는 남겨놓겠다는 뜻!!
            else {
                head = head.next; // 데이터를 지우기 위해서는 반드시 2개의 객체가 필요한데 
                                    //헤드를 지우려면 헤드의 위치를 다음 칸으로 넘기고  
                head.prev = null;   //기존 헤드였던 객체를 null로 초기화함으로서 연결을 끊는다. 그러면 기존 헤드는 garbage가 된다.
                return cursor.value; //어떤 것을 지웠나 확인차 기존 헤드의 데이터를 반환시켜줌 
            }
        }
        
        int count = 0;
        
        while (cursor != tail) {
            if (count == i) {
                cursor.prev.next = cursor.next;
                cursor.next.prev = cursor.prev;
                return cursor.value;
            }
            count++;
            cursor = cursor.next;
        }
        return null;
        
    }
    
    public void add(int i, Object value) {
        Bucket cursor = head;
        int count = 0;
        
        while (cursor != tail) {
            if (count == i) {
                Bucket bucket = new Bucket();
                bucket.value = value;
                bucket.prev = cursor.prev;
                cursor.prev = bucket;
                bucket.next = cursor;
                if (bucket.prev != null) {
                    bucket.prev.next = bucket;
                } else { // 이전에 다른 객차가 없다면 이 객체를 헤드로 만든다.
                    head = bucket;
                }
                return;
            }
            count++;
            cursor = cursor.next;
        }
        
        if (count == i) { // 맨 끝에 값을 추가하는 것이다.
            add(value);
        }
    }
    
}