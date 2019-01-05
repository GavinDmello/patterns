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
public class FacadeExample {
    public static void main(String[] args) {
        CarFunc c = new CarFunc();
        
        c.driveAudi();
        c.driveLamborghini();
    }
}
