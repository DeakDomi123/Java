package ZHgyak.FarkasFruzsi.ora4.sokszogekOnallo;

public class Teglalap extends Sokszog{
    protected double hosszabbOldal;
    private double rovidebbOldal;

    public Teglalap() {
    }

    public Teglalap(double hosszabbOldal, double rovidebbOldal) {
        super(4);
        if (rovidebbOldal <= 0) {
            rovidebbOldal = 1;
        }
        if (hosszabbOldal <= 0) {
            hosszabbOldal = 1;
        }
        if (hosszabbOldal < rovidebbOldal) {
            double s = hosszabbOldal;
            hosszabbOldal = rovidebbOldal;
            rovidebbOldal = s;
        }
        this.hosszabbOldal = hosszabbOldal;
        this.rovidebbOldal = rovidebbOldal;
    }

    public double getHosszabbOldal() {
        return hosszabbOldal;
    }

    public double getRovidebbOldal() {
        return rovidebbOldal;
    }

    @Override
    double kerulet() {
        return 2 * (rovidebbOldal + hosszabbOldal);
    }

    @Override
    double terulet() {
        return rovidebbOldal * hosszabbOldal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Teglalap{ ");
        sb.append("hosszabb oldal: ").append(hosszabbOldal);
        sb.append("rövidebb oldal: ").append(rovidebbOldal);
        sb.append("}");
        return sb.toString();
    }
}
