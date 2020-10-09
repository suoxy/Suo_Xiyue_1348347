// Xiyue Suo, NUID: 001348347
// INFO5100, Assignment_2

package Info;

import java.util.ArrayList;
import java.util.Date;

/**
 * This class creates and stores and storage of cars.
 * @author suoxiyue
 */
public class Fleet {
    private ArrayList<Car> carList;
    private Date date = new Date();

    public Fleet() {
        this.carList = new ArrayList<Car>();

        // add multiple cars to the storage list
        Car c1 = new Car("JEEP", "Boston", "Cherokee", 2020, 5, 666, "No", "Available", date);
        carList.add(c1);
        Car c2 = new Car("Honda", "NYC", "Civic", 2018, 5, 787, "No", "Available", date);
        carList.add(c2);
        Car c3 = new Car("Benz", "NYC", "CLA250", 2018, 7, 747, "No", "Available", date);
        carList.add(c3);
        Car c4 = new Car("Toyota", "NYC", "Passat", 2018, 5, 424, "No", "Non-available", date);
        carList.add(c4);
        Car c5 = new Car("BMW", "Boston", "x5", 2018, 5, 777, "No", "Non-available", date);
        carList.add(c5);
        Car c6 = new Car("Honda", "NYC", "CRV", 2018, 5, 789, "No", "Non-available", date);
        carList.add(c6);    
        Car c7 = new Car("Audi", "Boston", "Q8", 2020, 5, 765, "No", "Available", date);
        carList.add(c7);
        Car c8 = new Car("Benz", "Boston", "GLS", 2020, 7, 950, "No", "Available", date);
        carList.add(c8);
        Car c9 = new Car("Audi", "Boston", "Q8", 2017, 4, 950, "Yes", "Available", date);
        carList.add(c9);
        Car c10 = new Car("Toyota", "Boston", "Camry", 2015, 5, 230, "Yes", "Non-available", date);
        carList.add(c10);
        Car c11 = new Car("JEEP", "Boston", "Cherokee", 2017, 5, 400, "No", "Available", date);
        carList.add(c11);
        Car c12 = new Car("Toyota", "NYC", "Passat", 2010, 5, 424, "Yes", "Non-available", date);
        carList.add(c12);
        Car c13 = new Car("Benz", "Seattle", "CLA250", 2020, 5, 310, "Yes", "Available", date);
        carList.add(c13);
        Car c14 = new Car("Toyota", "Seattle", "Hignlander", 2010, 7, 230, "No", "Available", date);
        carList.add(c14);
    }   

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    // will add a new car to storage
    public Car addCar() {
        Car car = new Car();
        carList.add(car);
        return car;
    }
    
    // will remove a @para car from the storage
    public void deleteCar(Car car) {
        carList.remove(car);
    }
    
    // allow user to search the car by the serial number, the result will be returned
    public Car searchCar(int serialNum) {
        for (Car car: carList) {
            if (car.getSerialNumber() == (serialNum)) {
                return car;
            }
        }
        return null;
    }

    // add the @para car to the list
    public void addCar(Car car) {
         carList.add(car);
    }
    
}
