// Xiyue Suo, NUID: 001348347
// Assignment #1, INFO5100, 09/30/2020

package Person;
import java.util.ArrayList;

/**
 * This class stores profiles, and allows to retrieval.
 * @author suoxiyue
 */
public class InfoHistory {
    private ArrayList<Info> infoHistory;
    
    public InfoHistory() {
        infoHistory = new ArrayList<Info>();
        
    }

    public ArrayList<Info> getInfoHistory() {
        return infoHistory;
    }
    
    // @ takes profile history as parameter
    public void setInfoHistory(ArrayList<Info> infoHistory) {
        this.infoHistory = infoHistory;
    }
    
    // This method will add a profile to the history
    public Info addInfo() {
        Info info = new Info();
        infoHistory.add(info);
        return info;
    }
    
    // This method will delete a profile from the history
    // @takes a profile as parameter
    public void deleteInfo(Info i) {
        infoHistory.remove(i);
    }
    
}
