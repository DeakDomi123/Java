package ZHgyak.FarkasFruzsi.ora4.VehicleOnallo;

import java.util.Objects;

public abstract class Vehicle {
    private VehicleStatus status;
    private int numberOfWheels;
    private String id;

    public Vehicle(String id) {
        this.id = id;
        this.status = VehicleStatus.PARK;
        this.numberOfWheels = 0;
    }

    public Vehicle(int numberOfWheels, String id) {
        this.numberOfWheels = numberOfWheels;
        this.id = id;
    }
    public void setMove() {
        this.status = VehicleStatus.MOVE;
    }
    public void setStop(){
        this.status = VehicleStatus.STOP;
    }
    public void setPark(){
        this.status = VehicleStatus.PARK;
    }

    public VehicleStatus getStatus() {
        return status;
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
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(getId(), vehicle.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
