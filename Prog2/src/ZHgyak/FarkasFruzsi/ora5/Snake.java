public class Snake implements Animal {

    private double speedInMeterPerSec;
    private String sound = "";
    private double weight;
    private int numberOfLegs = 0;
    private String snakeType;

    public Snake(double speedInMeterPerSec, double weight, String snakeType) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.weight = weight;
        this.snakeType = snakeType;
    }

    public String getSnakeType() {
        return snakeType;
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
        final StringBuilder sb = new StringBuilder("Snake {");
        sb.append("speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", sound='").append(sound).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", numberOfLegs=").append(numberOfLegs);
        sb.append(", snakeType='").append(snakeType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
