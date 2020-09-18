// Xiyue Suo, NUID: 001348347
// Lab #1

package Business;

/**
 *
 * @author suoxiyue
 * this class creates the information of a product
 */
public class Product {
    
    // initializing product variables
    private String name;
    private String price;
    private String availNum;
    private String description;

    // setters and getters of variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailNum() {
        return availNum;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
      
}
