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
    public Car(String brand, String model, String registrationNumber, Person owner,
               int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Returns formatted information about the car.
     *
     * @return car details as a String
     */
    public String getInfo() {
        return "\nCar:\n\t"
                + "Brand: " + brand + "\n\t"
                + "Model: " + model + "\n\t"
                + "Registration Number: " + registrationNumber + "\n\t"
                + "Number of Doors: " + numberOfDoors + "\n\t"
                + "Belongs to " + owner.getName() + " - " + owner.getAddress();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
