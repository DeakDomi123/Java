public class Wind implements Move {

    private String direction;
    private double speedInMeterPerSec;

    public Wind(String direction, double speedInMeterPerSec) {
        this.direction = direction;
        this.speedInMeterPerSec = speedInMeterPerSec;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return speedInMeterPerSec;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wind {");
        sb.append("direction='").append(direction).append('\'');
        sb.append(", speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append('}');
        return sb.toString();
    }
}
