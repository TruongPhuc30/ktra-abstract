import java.util.ArrayList;
import java.util.List;

/**
 * Đại diện cho một người có thể sở hữu nhiều phương tiện.
 */
public class Person {
    /** Tên của người. */
    private String name;

    /** Địa chỉ của người. */
    private String address;

    /** Danh sách các phương tiện mà người này sở hữu. */
    private List<Vehicle> vehicleList;

    /**
     * Khởi tạo một đối tượng Person với tên và địa chỉ.
     *
     * @param name    tên của người
     * @param address địa chỉ của người
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<>();
    }

    /**
     * Thêm phương tiện vào danh sách nếu chưa tồn tại.
     *
     * @param vehicle phương tiện cần thêm
     */
    public void addVehicle(Vehicle vehicle) {
        if (!vehicleList.contains(vehicle)) {
            vehicleList.add(vehicle);
        }
    }

    /**
     * Xóa một phương tiện khỏi danh sách sở hữu dựa trên biển số.
     *
     * @param registrationNumber biển số của phương tiện cần xóa
     */
    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(v -> v.getRegistrationNumber().equals(registrationNumber));
    }

    /**
     * Trả về thông tin của tất cả phương tiện mà người này sở hữu.
     * Nếu không có phương tiện nào, trả về thông báo phù hợp.
     *
     * @return chuỗi thông tin về các phương tiện
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" has:\n\n");
        for (Vehicle v : vehicleList) {
            sb.append(v.getInfo()).append("\n");
        }
        return sb.toString().trim();
    }

    /**
     * Trả về tên của người.
     *
     * @return tên
     */
    public String getName() {
        return name;
    }

    /**
     * Trả về địa chỉ của người.
     *
     * @return địa chỉ
     */
    public String getAddress() {
        return address;
    }
}
