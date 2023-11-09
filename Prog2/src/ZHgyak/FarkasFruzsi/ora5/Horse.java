import java.time.LocalDate;

public class Horse implements Animal, MeansOfTransport, Comparable<Horse> {

    private double speedInMeterPerSec;
    private double carryingCapacityInKg;
    private String sound = "Nyihaha";
    private double weight;
    private int numberOfLegs = 4;
    private String name;
    private String color;
    private LocalDate birthDate;

    public Horse(double speedInMeterPerSec, double carryingCapacityInKg, double weight, String name, String color, LocalDate birthDate) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
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

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Horse{");
        sb.append("speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", carryingCapacityInKg=").append(carryingCapacityInKg);
        sb.append(", sound='").append(sound).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", numberOfLegs=").append(numberOfLegs);
        sb.append(", name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Horse o) {
//        int suly = Double.compare(this.weight, o.weight);
//        if (suly != 0) {
//            return suly;
//        }
        double suly = this.weight - o.weight;
        if (suly != 0) {
            return (int) suly;
        }
        return - this.name.compareTo(o.name);
    }
}
