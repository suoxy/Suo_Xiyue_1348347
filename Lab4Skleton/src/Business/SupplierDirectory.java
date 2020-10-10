// Xiyue Suo, NUID: 001348347
// INFO5100, Lab_4

package Business;

import Business.Abstract.User;
import Business.Users.Supplier;
import java.util.ArrayList;
import java.util.List;

/**
 * This class stores the created supplier accounts.
 * @author AEDSpring2019
 */
public class SupplierDirectory {
    
    private List<User> supplierList;
    
    public SupplierDirectory(){
        supplierList = new ArrayList<>();
    }

    public List<User> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<User> supplierList) {
        this.supplierList = supplierList;
    }
    
    public void addSupplier(User user) {
        supplierList.add(user);
    }
    
    
}
