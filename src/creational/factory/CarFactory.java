/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory;

/**
 *
 * @author gavin
 */
public class CarFactory {
    public Car getCar(String shapeType) {
        if (shapeType == "Audi") {
            return new Audi();
        }
        
        return new DefaultCar();
    }
}
