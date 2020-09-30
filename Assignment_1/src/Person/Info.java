// Xiyue Suo, NUID: 001348347
// Assignment #1, INFO5100, 09/30/2020

package Person;
import javax.swing.ImageIcon;

/**
 * This class initializes the attributes of a profile
 * @author suoxiyue
 */
public class Info {
    // create all attributes as private
    private String name;
    private String geographicData;
    private String birthday;
    private int telephone;
    private int fax;
    private String email;
    private int ssn;
    private int medicalRecordNum;
    private int healthPlanNum;
    private int bankAccountNum;
    private String license;
    private String vehicle;
    private String device;
    private String linkedIn;
    private String protocolAddress;
    private String bioIndentifier;
    private ImageIcon photo;    // use ImageIcon for photo
    private String personalCode;

    public ImageIcon getPhoto() { 
        return photo;
    }

    public void setPhoto(ImageIcon photo) { 
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(int medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public int getHealthPlanNum() {
        return healthPlanNum;
    }

    public void setHealthPlanNum(int healthPlanNum) {
        this.healthPlanNum = healthPlanNum;
    }

    public int getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(int bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getProtocolAddress() {
        return protocolAddress;
    }

    public void setProtocolAddress(String protocolAddress) {
        this.protocolAddress = protocolAddress;
    }

    public String getBioIndentifier() {
        return bioIndentifier;
    }

    public void setBioIndentifier(String bioIndentifier) {
        this.bioIndentifier = bioIndentifier;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
    
    @Override
    // Override the default toString method to make sure this method is called
    // every time the class is called.
    public String toString() {
        return this.name;
    }
    
}
