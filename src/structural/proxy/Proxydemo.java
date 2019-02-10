package structural.proxy;

/**
 *
 * @author gavin
 */
public class Proxydemo {
    public static void main(String[] args) {
       Car c = new ProxyCar();
       c.drive();
    }
}
