/*package mesehos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MKV implements MKVInterface{
    public static int jok=0;
    List<Mesehos> mesehosok = new ArrayList<Mesehos>();

    public MKV() {
    }

    public MKV(List<Mesehos> mesehosok) {
        this.mesehosok = mesehosok;
    }

    public static int getJok() {
        return jok;
    }

    public List<Mesehos> getMesehosok() {
        return mesehosok;
    }

    public static void setJok(int jok) {
        MKV.jok = jok;
    }

    public void setMesehosok(List<Mesehos> mesehosok) {
        this.mesehosok = mesehosok;
    }

        @Override
        public void feldolgoz() {

        }

        @Override
        public double osszBevetel() {
            double osszeg = 0;
            /*Iterator<Mesehos> bejaro = mesehosok.iterator();
            while (bejaro.hasNext()){
                Mesehos hos = bejaro.next();
                osszeg = osszeg + hos.osszegez();
            }
            for (Mesehos hos: mesehosok) {
                osszeg = osszeg + hos.osszegez();
            }
            return osszeg;
        }

        @Override
        public String legnagyobbKolcsonzesiNapiaruHos() {
            return null;
        }

        @Override
        public double legkisebbKolcsonzesiOsszeg() {
            return 0;
        }

        @Override
        public double atlagosAr() {
            return 0;
        }

        @Override
        public String megmentette() {
            Ogre shrek = null;
            for (Mesehos hos: mesehosok) {
                if(hos instanceof Ogre){
                    shrek = (Ogre) hos;
                }
            }
            if(shrek!=null){
                for (Mesehos hos: mesehosok) {
                    if(hos.kiralyLanyMentes(shrek)){
                        return "Megmentette";
                    }
                }
            }
            return "Nem mentette meg";
        }

        @Override
        public String otNaposKolcsonzottek() {
            return null;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Jó hősök: "+MKV.jok);
            sb.append("Hőseink:\n");
            for (Mesehos hos: mesehosok) {
                sb.append(hos.toString());
            }
            return sb.toString();
        }
}
*/