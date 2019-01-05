package structural.flyweight;

import java.util.HashMap;

/**
 *
 * @author gavin
 */
public class CarFactory {
    
    private HashMap<String, Car> carStore = new HashMap<String, Car>();
    
    public Car getCar(String carType) {
        if(carStore.containsKey(carType)) {
            return carStore.get(carType);
        }
        
        Car tesla = new Tesla(carType);
        carStore.put(carType, tesla);
        
        return tesla;
    }
}
