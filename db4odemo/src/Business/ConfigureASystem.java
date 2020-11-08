package Business;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
               
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("s", "ss", employee, new SystemAdminRole());
        system.getOrganizationList().add(new CustomerAdminOrg());
        system.getOrganizationList().add(new RestaurantAdminOrg());
        system.getOrganizationList().add(new DeliveryManAdminOrg());
        
        Employee customer = new Employee();
        customer.setName("cus");
        system.getUserAccountDirectory().createUserAccount("cus", "1", customer, new CustomerRole());
        
        Employee resta = new Employee();
        resta.setName("rest1");
        system.getUserAccountDirectory().createUserAccount("rest", "1", resta, new AdminRole());
        
        Employee deli = new Employee();
        deli.setName("deliveryManOne");
        system.getUserAccountDirectory().createUserAccount("delivery", "1", deli, new DeliverManRole());
        
        return system;
        
        
        
    }
    
}
