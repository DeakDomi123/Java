/*public class Car extends Vehicle {

    private boolean engineIsWorking;
    private int horsepower;

    public Car(String licencePlate) {
        super(4, licencePlate);
        this.engineIsWorking = true;
    }

    public Car(String licencePlate, int horsepower) {
        this(licencePlate);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isEngineIsWorking() {
        return engineIsWorking;
    }

    private void setEngineIsWorking(boolean engineIsWorking) {
        this.engineIsWorking = engineIsWorking;
    }

    public void setEngineToWork() {
        setEngineIsWorking(true);
    }

    public void setEngineToStop() {
        setEngineIsWorking(false);
    }

    @Override
    public void setMove() {
        super.setMove();
        this.engineIsWorking = true;
    }

    @Override
    public void setStop() {
        super.setStop();
        this.engineIsWorking = false;
    }

    @Override
    public void setPark() {
        super.setPark();
        this.engineIsWorking = false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("licencePlate= ").append(getId());
        sb.append(", status= ").append(getStatus());
        sb.append(", engineIsWorking=").append(engineIsWorking);
        sb.append(", horsepower=").append(horsepower);
        sb.append('}');
        return sb.toString();
    }
}*/
