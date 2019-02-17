package structural.decorator;

/**
 *
 * @author gavin
 */
public class RedTesla extends CarDecorator {
    
    public RedTesla(Car car) {
        super(car);
    }
    
    @Override
    public void drive() {
        super.drive();
        setColor();
    }
    
    public void setColor() {
        System.out.println("Setting color red");
    }
    
}
