package creational.singleton;

/**
 *
 * @author gavin
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        
        Singleton s2 = Singleton.getInstance();
        
        if(s1.equals(s2)) {
            System.out.println("Singleton done");
        }
    }
}
