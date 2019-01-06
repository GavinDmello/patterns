package structural.filter;

import java.util.List;

/**
 *
 * @author gavin
 */
public interface Criteria {
    public List<Car> filterObjects(List<Car> carList);
}
