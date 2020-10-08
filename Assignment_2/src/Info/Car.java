// Xiyue Suo, NUID: 001348347
// INFO5100, Assignment_2

package Info;

import java.util.Date;

/**
 * This is class defines the attributes of a car.
 * @author suoxiyue
 */
public class Car {
    private String manufacturer;
    private String city;
    private String model;
    private int year;
    private int seatNum;
    private int serialNumber;    
    private String expired;  
    private String availability;  
    private Date createdOn;

    // constructor
    public Car() {
        this.createdOn = new Date();
        
    }
    
    // constructor with attributes as parameters
    public Car (String manufacturer, String city, String model, int year, int seatNum,
                int serialNumber, String expired, String availability, Date date) { 
        this.manufacturer = manufacturer;
        this.city = city;
        this.model = model;
        this.year = year;
        this.seatNum = seatNum;
        this.serialNumber = serialNumber;
        this.expired = expired;
        this.availability = availability;
        this.createdOn = date;
        
    }

    // setters and getters of attributes
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String isExpired() {
        return expired;
    }

    public String getExpired() {
        return expired;
    }

    public String getAvailability() {
        return availability;
    }

    public Date getCreatedOn() {
        Date time= new Date();
        return time;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    
    
    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String isAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Date getUpdatedTime() {
        return createdOn;
    }  
    
    // the manufacturer will be returned once the class is called.
    @Override
    public String toString() {
        return manufacturer;
    }
    
}
