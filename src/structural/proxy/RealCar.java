package structural.proxy;

/**
 *
 * @author gavin
 */
public class RealCar implements Car {

    @Override
    public void drive() {
        System.out.println("Driving real car");
    }
    
}
