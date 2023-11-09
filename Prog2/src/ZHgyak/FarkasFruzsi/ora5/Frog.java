public class Frog implements Animal {

    private double speedInMeterPerSec;
    private String sound;
    private double weight;
    private int numberOfLegs = 4;

    public Frog(double speedInMeterPerSec, double weight) {
        this.sound = "Brekeke";
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.weight = weight;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return speedInMeterPerSec;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public double getWeightInKg() {
        return weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Frog{");
        sb.append("speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", sound='").append(sound).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", numberOfLegs=").append(numberOfLegs);
        sb.append('}');
        return sb.toString();
    }
}
