/*import java.util.Objects;*/

/*public abstract class Vehicle {

    private VehicleStatus status;
    private int numberOfWheels;
    private String id;

    public Vehicle() {
    }

    public Vehicle(String id) {
        super();
        this.id = id;
        this.status = VehicleStatus.PARK;
        this.numberOfWheels = 0;
    }

    public Vehicle(int numberOfWheels, String id) {
        this(id);
        this.numberOfWheels = numberOfWheels;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setMove() {
        this.status = VehicleStatus.MOVE;
    }

    public void setStop() {
        this.status = VehicleStatus.STOP;
    }
    public void setPark() {
        this.status = VehicleStatus.PARK;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if (numberOfWheels < 0) {
            return;
        }
        this.numberOfWheels = numberOfWheels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jármű {");
        sb.append("status=").append(status);
        sb.append(", numberOfWheels=").append(numberOfWheels);
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return this.id.equals(vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}*/
