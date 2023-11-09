import java.time.LocalDate;

public class Ostrich implements Animal, MeansOfTransport {

    private double speedInMeterPerSec;
    private double carryingCapacityInKg;
    private String sound = "Bleep";
    private double weight;
    private int numberOfLegs = 2;
    private String name;
    private String featherPattern;
    private LocalDate birthDate;

    public Ostrich(double speedInMeterPerSec, double carryingCapacityInKg, double weight, String name, String featherPattern, LocalDate birthDate) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.weight = weight;
        this.name = name;
        this.featherPattern = featherPattern;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getFeatherPattern() {
        return featherPattern;
    }

    public LocalDate getBirthDate() {
        return birthDate;
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
    public String getSound() {
        return sound;
    }

    @Override
    public double getWeightInKg() {
        return weight;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ostrich {");
        sb.append("speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", carryingCapacityInKg=").append(carryingCapacityInKg);
        sb.append(", sound='").append(sound).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", numberOfLegs=").append(numberOfLegs);
        sb.append(", name='").append(name).append('\'');
        sb.append(", featherPattern='").append(featherPattern).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }
}
