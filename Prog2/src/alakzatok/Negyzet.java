package alakzatok;

public class Negyzet extends Sikidom{
    private final int a;

    public Negyzet(int a) {
        this.a = a;
    }

    @Override
    public double felszin() {
        return 4* a;
    }

    @Override
    public double terfogat() {
        return a*a;
    }
}
