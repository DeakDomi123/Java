package ZHgyak.FarkasFruzsi.ora4.sokszogekOnallo;

public class Nagyzet extends Teglalap{
    public Nagyzet(double oldalhossz) {
        super(oldalhossz, oldalhossz);
    }

    public double getOldalhossz() {
        return hosszabbOldal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Negyzet {");
        sb.append("oldalhossz= ").append(getOldalhossz());
        sb.append('}');
        return sb.toString();
    }
}
