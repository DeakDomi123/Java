package ZHgyak.FarkasFruzsi.ora3;

import java.util.Objects;

public class KozonsegesTort {

    private int szamlalo;
    private int nevezo;

    private static int kozonsegesTortekSzama = 0;

    public KozonsegesTort() {
        super();
        kozonsegesTortekSzama++;
        this.szamlalo = 0;
        this.nevezo = 1;
    }

    public KozonsegesTort(int szamlalo, int nevezo) {
        kozonsegesTortekSzama++;
        this.szamlalo = szamlalo;
        if (nevezo == 0) {
            nevezo = 1;
        }
        this.nevezo = nevezo;
        egyszerusit();
    }

    public KozonsegesTort(int szamlalo) {
        this(szamlalo, 1);
    }

    public int getSzamlalo() {
        return this.szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    public int getNevezo() {
        return nevezo;
    }

    public void setNevezo(int nevezo) {
        if (nevezo == 0) {
            nevezo = 1;
        }
        this.nevezo = nevezo;
    }

    public static int getKozonsegesTortekSzama() {
        return kozonsegesTortekSzama;
    }

    public double tort() {
        return (double) szamlalo / nevezo;
    }

    public void megszoroz(KozonsegesTort k1) {
        this.szamlalo *= k1.getSzamlalo();
        this.nevezo *= k1.getNevezo();
        egyszerusit();
    }

    public void oszt(KozonsegesTort k1) {
        k1.reciprok();
        megszoroz(k1);
        egyszerusit();
    }

    public void reciprok() {
        int s = nevezo;
        nevezo = szamlalo;
        szamlalo = s;
        egyszerusit();
    }

    private void egyszerusit() {

        int p_sz = Math.abs(szamlalo);
        int p_n = Math.abs(nevezo);
        int lnko;
        while (true) {
            if (p_sz == p_n) {
                lnko = p_sz;
                break;
            }
            if (p_sz > p_n)
                p_sz -= p_n;
            if (p_n > p_sz)
                p_n -= p_sz;
        }
        if (nevezo < 0) {
            szamlalo = -szamlalo;
            nevezo = -nevezo;
        }
        szamlalo/=lnko;
        nevezo/=lnko;
    }

    public void egeszetHozzaad(int egesz) {
        this.szamlalo += egesz * nevezo;
        egyszerusit();
    }

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append(szamlalo);
//        builder.append("/");
//        builder.append(nevezo);
//        return builder.toString();
//    }

    @Override
    public int hashCode() {
        return Objects.hash(szamlalo, nevezo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KozonsegesTort)) {
            return false;
        }
        KozonsegesTort k1 = (KozonsegesTort) obj;
        k1.egyszerusit();
        this.egyszerusit();
        if (k1.nevezo == this.nevezo &&k1.szamlalo == this.szamlalo) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("KozonsegesTort{");
        sb.append("szamlalo=").append(szamlalo);
        sb.append(", nevezo=").append(nevezo);
        sb.append('}');
        return sb.toString();
    }
}