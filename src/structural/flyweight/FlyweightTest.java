package structural.flyweight;

/**
 *
 * @author gavin
 */
public class FlyweightTest {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        Car teslaModelS1 = cf.getCar("Model S");
        Car teslaModelS2 = cf.getCar("Model S");
        
        if(teslaModelS1.equals(teslaModelS2)) {
            System.out.println("Same object returned");
        }
    }
}
