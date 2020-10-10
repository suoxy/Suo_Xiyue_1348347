// Xiyue Suo, NUID: 001348347
// INFO5100, Lab_4

package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.util.Date;

/**
 * This class extends from User class, and modified as customer class.
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Supplier> {
    private ProductDirectory directory;
    private Date date;
    
    public Customer(String password, String userName) {
        super(password, userName, "CUSTOMER");
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
