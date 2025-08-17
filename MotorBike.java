/**
 * Represents a motorbike, which is a type of vehicle.
 */
public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructs a MotorBike with specified attributes.
     *
     * @param brand              the brand of the motorbike
     * @param model              the model of the motorbike
     * @param registrationNumber the registration number
     * @param owner              the owner of the motorbike
     * @param hasSidecar         whether the motorbike has a sidecar
     */
    public MotorBike(String brand, String model, String registrationNumber, Person owner,
                     boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    public boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    /**
     * Returns formatted information about the motorbike.
     *
     * @return motorbike details as a String
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n\t"
                + "Brand: " + brand + "\n\t"
                + "Model: " + model + "\n\t"
                + "Registration Number: " + getRegistrationNumber() + "\n\t"
                + "Has Side Car: " + hasSidecar
                + (getOwner() != null
                ? "\n\tBelongs to " + getOwner().getName()
                + " - " + getOwner().getAddress()
                : "");
    }
}
