package step11.ex17;

public class Sedan extends Car {
    @Override
    public void run() {
        System.out.println("그냥 달린다.");
        
    }
    
    public void doSunroof(boolean open) {
        if(open) {
            System.out.println("선루프를 연다.");
        } else {
            System.out.println("선루프를 닫는다.");
        }
    }
}
