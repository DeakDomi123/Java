package InputOutputKezeles;

import java.io.*;

public class Tipusos {
    public static void main(String[] args) {
        File allomany = new File("adatok.dat");
        DataInputStream be = null;
        DataOutputStream ki = null;

        try {
            ki = new DataOutputStream(new FileOutputStream(allomany));
            ki.writeInt(34);
            ki.writeBoolean(true);
            ki.writeDouble(3.14);
            ki.writeUTF("Hello World!");
            ki.flush();
            ki.close();

            be  = new DataInputStream(new FileInputStream(allomany));
            int szam = be.readInt();
            boolean igaz = be.readBoolean();
            double pi = be.readDouble();
            String szoveg = be.readUTF();
            System.out.println(szam+ "\n" + igaz + "\n" + pi + "\n "+ szoveg);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
