/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.facade;

/**
 *
 * @author gavin
 */
public class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("Driving my Audi");
    }
    
}
