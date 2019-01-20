/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.mememto;

/**
 *
 * @author gavin
 */
public class StateMaker {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    
    public Memento saveToMememto() {
        return new Memento(state);
    }
    
    public int getFromMememto(Memento m) {
        return m.getState();
    }
}
