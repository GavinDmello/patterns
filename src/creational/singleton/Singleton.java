package creational.singleton;

/**
 *
 * @author gavin
 */
public class Singleton {
    private static Singleton s = new Singleton();
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        return s;
    }
}
