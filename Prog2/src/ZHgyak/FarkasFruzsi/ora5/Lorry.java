public class Lorry implements MeansOfTransport {

    private int numberOfWheels;
    private double enginePowerInKw;
    private double speedInMeterPerSec;
    private double carryingCapacityInKg;
    private double weight;

    public Lorry(int numberOfWheels, double enginePowerInKw, double speedInMeterPerSec, double carryingCapacityInKg, double weight) {
        this.numberOfWheels = numberOfWheels;
        this.enginePowerInKw = enginePowerInKw;
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getEnginePowerInKw() {
        return enginePowerInKw;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return speedInMeterPerSec;
    }

    @Override
    public double getCarryingCapacityInKg() {
        return carryingCapacityInKg;
    }

    @Override
    public double getWeightInKg() {
        return weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lorry{");
        sb.append("numberOfWheels=").append(numberOfWheels);
        sb.append(", enginePowerInKw=").append(enginePowerInKw);
        sb.append(", speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", carryingCapacityInKg=").append(carryingCapacityInKg);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
