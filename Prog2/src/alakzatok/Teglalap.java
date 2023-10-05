package alakzatok;

public class Teglalap extends Sikidom{
    private final int a;
    private final int b;

    public Teglalap(int a, int b, int c) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double felszin() {
        return 0;
    }

    @Override
    public double terfogat() {
        return 0;
    }
}
