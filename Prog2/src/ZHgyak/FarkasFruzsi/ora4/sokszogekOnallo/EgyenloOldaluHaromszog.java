package ZHgyak.FarkasFruzsi.ora4.sokszogekOnallo;

public class EgyenloOldaluHaromszog extends Sokszog{
    private double oldalhossz;

    public EgyenloOldaluHaromszog() {

    }
    public EgyenloOldaluHaromszog(double oldalhossz) {
        this.oldalhossz = oldalhossz;
    }

    public double getOldalhossz() {
        return oldalhossz;
    }

    @Override
    double kerulet() {
        return 3 * oldalhossz;
    }

    @Override
    double terulet() {
        return oldalhossz * oldalhossz * Math.sqrt(3)/4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EgyenloOldaluHaromszog{");
        sb.append("oldalhossz=").append(oldalhossz);
        sb.append('}');
        return sb.toString();
    }
}
