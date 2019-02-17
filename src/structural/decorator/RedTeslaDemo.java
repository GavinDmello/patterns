package structural.decorator;

/**
 *
 * @author gavin
 */
public class RedTeslaDemo {
   public static void main(String[] args) {
       Car tesla = new Tesla();
       Car redTesla = new RedTesla(tesla);
       
       redTesla.drive();
   }
}
