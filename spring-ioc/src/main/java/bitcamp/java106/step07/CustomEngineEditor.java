// 프로퍼티 에디터 만들디
package bitcamp.java106.step07;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

// 프로퍼티 에디터 만드는 방법
// => java.beans.PropertyEditor 인터페이스를 구현하면 된다.
// => 그러나 이 인터페이스를 직접 구현하려면 많은 메서드(12개의 메서드)를 모두 구현해야 한다.
//    너무 번거롭다.
// => 그래서 java는 propertyEditor를 미리 구현한 PropertyEditorSupport 라는 클래스를 제공한다.
//    따라서 인터페이스를 직접 구현하지 말고 이 클래스를 상속 받아라
// 1) java.beans.PropertyEditorSupports를 상속받는다.
//    
public class CustomEngineEditor extends PropertyEditorSupport{
    // 이 메서드는 스프링 IoC 컨테이너가 String 타입의 프로퍼티 값을
    // 다른 타입의 값으로 바꿀 떄 호출하는 메서드이다.
    // =>
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] values = text.split(",");
        Engine engine = new Engine();
        engine.setMaker(values[0]);
        engine.setValve(Integer.parseInt(values[1]));
        engine.setCylinder(Integer.parseInt(values[2]));
        
        this.setValue(engine);
    }
}
