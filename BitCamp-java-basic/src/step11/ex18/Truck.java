package step11.ex18;

public class Truck extends Car {
    
    @Override
    public void run() {
        System.out.println("덩컬덜컹달린다.");
    }
    public void dump() {
        System.out.println("짐을 내린다.");
    }
}
