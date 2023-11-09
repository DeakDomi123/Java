package ZHgyak.FarkasFruzsi.ora4.VehicleOnallo;

public class Car extends Vehicle{
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
}
