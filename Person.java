/**
 * Represents a person who can own multiple vehicles.
 */
public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Constructs a Person with a name and address.
     *
     * @param name    the person's name
     * @param address the person's address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<>();
    }

    /**
     * Adds a vehicle to the person's list.
     *
     * @param vehicle the vehicle to add
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Removes a vehicle from the list by registration number.
     *
     * @param registrationNumber the registration number of the vehicle to remove
     */
    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(v -> v.getRegistrationNumber().equals(registrationNumber));
    }

    /**
     * Returns information about all vehicles owned by the person.
     *
     * @return a formatted string of vehicle details
     */
    public String getVehiclesInfo() {
        StringBuilder sb = new StringBuilder();
        for (Vehicle v : vehicleList) {
            sb.append(v.getInfo()).append("\n");
        }
        return sb.toString();
    }

    public String getName() { 
        return name; 
    }
    
    public String getAddress() { 
        return address; 
    }
}
