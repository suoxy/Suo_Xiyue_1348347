// Xiyue Suo, NUID: 001348347
// INFO5100, Lab_5

package Business;

import java.util.ArrayList;

/**
 *
 * @author suoxiyue
 */
public class MasterOrderCatalog {
    private ArrayList<Order> orderCatalog;
    
    public MasterOrderCatalog() {
        orderCatalog = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
    public Order addOrder(Order o) {
        orderCatalog.add(o);
        return o;
    }
}
