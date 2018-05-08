package bitcamp.java106.step06;

public class CarFactory {
    public static Car create(String model) {
        Car c = new Car();
        switch (model) {
        case "티코":
            c.setMaker("대우자동차");
            c.setModel("티코");
            c.setCc(890);
            return c;
        case "소나타":
            c.setMaker("현대자동차");
            c.setModel("Sonata");
            c.setCc(1890);
            return c;
        case "SM5":
            c.setMaker("르노자동차");
            c.setModel("SM5");
            c.setCc(1990);
            return c;  
        default:
            c.setMaker("비트자동차");
            c.setModel("자바");
            c.setCc(5000);
            return c;
        }
    }
}
