package structural.decorator;

/**
 *
 * @author gavin
 */
public abstract class CarDecorator implements Car {
    protected Car car;
    
    public CarDecorator(Car car) {
        this.car = car;
    }
   
    public void drive() {
        this.car.drive();
    }
}
