// Xiyue Suo, NUID: 001348347
// INFO5100, Lab_3

package Business;

import java.util.ArrayList;

/**
 * This class stores the created accounts.
 * @author suoxiyue
 */
public class AccountDirectory {
    private ArrayList<Account> accountList;

    public AccountDirectory() {
        this.accountList = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account addAccount() {
        Account account = new Account();
        accountList.add(account);
        return account;
    }
    
    // the specific accounts will be deleted once this method be called
    public void deleteAccount(Account account) {
        accountList.remove(account);
    }
    
    // the account details will be returned if the search matched
    public Account searchAccount(String accountNumber) {
        for (Account account: accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
