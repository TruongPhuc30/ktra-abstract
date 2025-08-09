/**
 * Represents a car, which is a type of vehicle.
 */
public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructs a Car with specified attributes.
     *
     * @param brand              the brand of the car
     * @param model              the model of the car
     * @param registrationNumber the registration number
     * @param owner              the owner of the car
     * @param numberOfDoors      the number of doors
     */
    public Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Returns formatted information about the car.
     *
     * @return car details as a String
     */
    @Override
    public String getInfo() {
        return "Car:\n" +
                "  Brand: " + brand + "\n" +
                "  Model: " + model + "\n" +
                "  Registration Number: " + registrationNumber + "\n" +
                "  Number of Doors: " + numberOfDoors + "\n" +
                "  Belongs to " + owner.getName() + " - " + owner.getAddress();
    }

    public int getNumberOfDoors() { 
        return numberOfDoors; 
    }
    
    public void setNumberOfDoors(int numberOfDoors) { 
        this.numberOfDoors = numberOfDoors;
    }
}
