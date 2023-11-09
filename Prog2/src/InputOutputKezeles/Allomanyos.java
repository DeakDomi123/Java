package InputOutputKezeles;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Allomanyos {
    public static void main(String[] args) {
        File allomany = new File("valami.txt");
        System.out.println(System.getProperty("user.dir"));
        //System.setProperty("user.dir", "C:\\User\\deakd");
        //System.out.println(System.getProperty("user.dir"));
        System.out.println(allomany.getAbsolutePath());
        try {
            System.out.println(allomany.getCanonicalPath());
            boolean letrehozva = allomany.createNewFile();
            File temp = File.createTempFile("temp",".tmp");
            System.out.println(temp.getAbsolutePath());
            temp.deleteOnExit();
            if(temp.exists()){
                System.out.println("Az állomány létezik;");
            }
            allomany.delete();
            File regi = new File("regi.txt");
            regi.createNewFile();
            File uj = new File("uj.txt");
            regi.renameTo(uj);
            //regi.mkdir() és regi.mkdirs folderek létrehozása

            FileFilter szuro = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if(pathname.isFile()){
                        String nev = pathname.getName().toLowerCase();
                        if(nev.endsWith(".sys")){
                            return true;
                        }
                    }
                    return false;
                }
            };
            System.out.println("SYS állmányok");
            File konyvtar = new File("C:\\");
            File[] gyoker = konyvtar.listFiles(szuro);
            for(File f:gyoker){
                System.out.println(f.isFile()?"--------- "+f.getName():"d-------- "+f.getName());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
