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
public class CarFactoryDemo {
    public static void main(String[] args) {
        CarFactory c = new CarFactory();
        c.getCar("Audi");
    }
}
