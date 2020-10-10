// Xiyue Suo, NUID: 001348347
// INFO5100, Lab_4

package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;

/**
 * This class extends from user and modified as supplier.
 * @author AEDSpring2019
 */
public class Supplier extends User implements Comparable<Supplier>{
    
    private ProductDirectory directory;
    
    public Supplier(String password, String userName) {
        super(password, userName, "SUPPLIER");
        directory = new ProductDirectory();
    }

    public ProductDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(ProductDirectory directory) {
        this.directory = directory;
    }

    @Override
    public int compareTo(Supplier o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
