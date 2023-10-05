package alakzatok;

public class haromszog extends Sikidom{
    private final int a;
    private final int b;
    private final int c;

    public haromszog(int a, int b, int c) {
        if(a+b <= c || a+c <= b || b+c <= a){
            throw new IllegalArgumentException("Nem szerkeszthető");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double felszin() {
        return a+b+c;
    }

    @Override
    public double terfogat() {
        double s = (kerulet()/2);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
