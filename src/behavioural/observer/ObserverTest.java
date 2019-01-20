/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.observer;

/**
 *
 * @author gavin
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject s = new Subject();
        new StateChangeObserver(s);
        
        s.setState(0);
        s.setState(10);
        s.setState(15);
        
    }
}
