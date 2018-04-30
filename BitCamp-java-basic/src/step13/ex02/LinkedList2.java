package step13.ex02;

public class LinkedList2<E> {
    
    
    protected class Bucket { 
        public E value; 
        public Bucket next; 
        public Bucket prev; 
    }
    
    protected Bucket head; 
    protected Bucket tail; 
    
    public LinkedList2() {
        
        head = new Bucket();
        tail = head;
    }

    public void add(E value) {
        tail.value = value;
        Bucket bucket = new Bucket();
        tail.next = bucket; 
        bucket.prev = tail;
        
        tail = bucket;
        
        
    }

    public E get(int i) {
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

    public E remove(int i) {
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
    
    public void add(int i, E value) {
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