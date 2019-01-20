package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gavin
 */
public class Subject {
    List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers(state);
    }
    
    private void notifyObservers(int state) {
        for (Observer o: observers) {
            o.update(state);
        }
    }
    
    public void attach(Observer o) {
        observers.add(o);
    } 
}
