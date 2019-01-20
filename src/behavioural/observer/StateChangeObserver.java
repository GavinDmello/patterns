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
public class StateChangeObserver extends Observer {

    public StateChangeObserver(Subject subject) {
        subject.attach(this);
    }
    
    @Override
    public void update(int state) {
        System.out.println("Update was called with " + String.valueOf(state));
    }
    
}
