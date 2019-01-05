package structural.flyweight;

/**
 *
 * @author gavin
 */
public class Tesla implements Car {
    
    private String type;
    
    public Tesla(String carType) {
        this.type = carType;
    }
    
    @Override
    public void drive() {
        System.out.println("My Electric car");
    }
    
}
