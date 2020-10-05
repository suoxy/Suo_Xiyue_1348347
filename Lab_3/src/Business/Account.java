// Xiyue Suo, NUID: 001348347
// INFO5100, Lab_3

package Business;
import java.util.Date;

/**
 * This class initializes variables used in the project.
 * @author suoxiyue
 */
public class Account {
    private String routingNumber;
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createdOn;
    
    // constructor
    public Account() {
        this.createdOn = new Date(); // date will be generated automatically
    }
      
    // setters and getts of variables
    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNunber) {
        this.routingNumber = routingNunber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    
    @Override
    // bank name will be returned if the class be called
    public String toString() {
        return bankName;
    }
}
