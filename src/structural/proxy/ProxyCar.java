package structural.proxy;

/**
 *
 * @author gavin
 */
public class ProxyCar implements Car {
    
    RealCar realCar = new RealCar();

    @Override
    public void drive() {
        realCar.drive();
    }
    
}
