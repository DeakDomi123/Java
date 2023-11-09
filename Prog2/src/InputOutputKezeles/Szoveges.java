package InputOutputKezeles;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Szoveges {
    public static void main(String[] args) {
        File szoveges = new File("szoveges.txt");
        try {
            //BufferedWriter ki = new BufferedWriter(new FileWriter(szoveges));
            //BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
            String sor = null;
            /*do{
                sor = be.readLine();
                ki.append(sor);
                ki.newLine();
            }while(!sor.equals("vege"));
            ki.flush();
            be.close();
            ki.close();
*/
            BufferedReader bebe = new BufferedReader(new FileReader(szoveges));
            sor = null;
            while((sor=bebe.readLine())!=null){
                String[] tomb = sor.split(";");
                //System.out.println(sor);
                for(String s : tomb){
                    System.out.println(s);
                }
                StringTokenizer felbont = new StringTokenizer(sor, ";");
                while(felbont.hasMoreTokens()){
                    System.out.println(felbont.nextToken());
                }
            }
            System.out.println("Scanner ");
            Scanner bebebe = new Scanner(szoveges);
            bebebe.useDelimiter(";");
            while(bebebe.hasNext()){
                System.out.println(bebebe.next());
            }
            bebe.close();
            bebebe.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
