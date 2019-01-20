package behavioural.mememto;

/**
 *
 * @author gavin
 */
public class MementoTest {
    public static void main(String[] args) {
        StateMaker s = new StateMaker();
        Keeper k = new Keeper();
        
        s.setState(5);
        Memento five = s.saveToMememto();
        k.add(five);
        
        s.setState(10);
        Memento ten = s.saveToMememto();
        k.add(ten);
        
        System.out.println(s.getFromMememto(k.get(2)));
        
    }
}
