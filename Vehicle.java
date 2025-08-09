/**
 * Abstract class representing a generic vehicle.
 */
public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Constructs a Vehicle with specified attributes.
     *
     * @param brand              the brand of the vehicle
     * @param model              the model of the vehicle
     * @param registrationNumber the registration number
     * @param owner              the owner of the vehicle
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Returns formatted information about the vehicle.
     *
     * @return vehicle details as a String
     */
    public abstract String getInfo();

    /**
     * Transfers ownership of the vehicle to a new person.
     *
     * @param newOwner the new owner of the vehicle
     */
    public void transferOwnership(Person newOwner) {
        if (owner != null) {
            owner.removeVehicle(registrationNumber);
        }
        this.owner = newOwner;
        newOwner.addVehicle(this);
    }

    public String getRegistrationNumber() { 
      return registrationNumber;
    }
  
    public Person getOwner() { 
      return owner; 
    }
}
