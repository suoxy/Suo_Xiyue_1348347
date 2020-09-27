// Xiyue Suo, NUID: 001348347
// Lab #2
package Business;

/**
 *
 * @author suoxiyue
 * This class defines the variables, and their setter and getter.
 */
public class VitalSigns {
    private double temperature;
    private double bloodPressure;
    private int pulse;
    private String date;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    // override the toString method to ensure the display menu shows the
    // correct date info
    public String toString() {
        return this.date;
    }
        
    
}
