package behavioural.mememto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gavin
 */
public class Keeper {
    private List<Memento> listOfMementos = new ArrayList<Memento>();
    
    public void add(Memento state){
      listOfMementos.add(state);
    }

    public Memento get(int index){
      return listOfMementos.get(index);
    }
    
    public List getAllMementos() {
        return listOfMementos;
    }
    
}
