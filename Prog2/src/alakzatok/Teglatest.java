package alakzatok;

public class Teglatest extends Test{
    private final int a;
    private final int b;
    private final int c;

    public Teglatest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
