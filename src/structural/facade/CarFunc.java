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
public class CarFunc {
    private Car audi;
    private Car lamborghini;
    
    public CarFunc() {
        this.audi = new Audi();
        this.lamborghini = new Lamborghini();
    }
    
    
    public void driveAudi() {
        this.audi.drive();
    }
    
    public void driveLamborghini() {
        this.lamborghini.drive();
    }
    
}
