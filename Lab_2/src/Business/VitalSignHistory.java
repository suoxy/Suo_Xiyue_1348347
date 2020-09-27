// Xiyue Suo, NUID: 001348347
// Lab #2
package Business;
import java.util.ArrayList;

/**
 *
 * @author suoxiyue
 * This class creates, stores, and modify vital signs. 
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> vitalSignHistory;
    
    // constructor
    public VitalSignHistory() {
        vitalSignHistory = new ArrayList<VitalSigns>();
    }

    // this method returns the storage
    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    // this method takes a storage list as parameter, and sets it as storage 
    // for later use
    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    // this method will add one vital sign to the storage.
    public VitalSigns addVitals() {
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    // this method takes one vital sign as parameter, and
    // able to delete one sepecific vital sign from storage.
    public void deleteVitals(VitalSigns v) {
        vitalSignHistory.remove(v);
    }
        
    
    
}
