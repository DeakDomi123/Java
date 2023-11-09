package alakzatok;

public class Kor extends Sikidom{
    private final int r;

    public Kor(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public double felszin() {
        return 2 * r * Math.PI;
    }

    @Override
    public double terfogat() {
        return Math.pow(r, 2) * Math.PI;
    }
}
