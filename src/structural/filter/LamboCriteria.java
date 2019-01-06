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
public class LamboCriteria implements Criteria {

    @Override
    public List<Car> filterObjects(List<Car> carList) {
        List filteredList = new ArrayList<Car>();
        
        for (Car c : carList) {
            if (c.getName().equals("Lamborghini")) {
                filteredList.add(c);
            }
        }
        
        return filteredList;
    }
    
}
