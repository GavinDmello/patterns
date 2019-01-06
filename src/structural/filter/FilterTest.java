/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gavin
 */
public class FilterTest {
    public static void main(String[] args) {
        Car lambo = new Car("Lambo", "black");
        Car audi = new Car("Audi", "white");
        
        List carList = new ArrayList();
        carList.add(audi);
        carList.add(lambo);
        
        Criteria lamboCheck = new LamboCriteria();
        List filteredList = lamboCheck.filterObjects(carList);
        
        assert(filteredList.get(0).equals(lambo));
    }
}
