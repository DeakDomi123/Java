import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        char c = 'a';
        int i = 10;
        float f = 10.5f;
        double d = 10.5;
        boolean b = true;
        String tesztvar = "Ez egy teszt változó.";
        out.println("Hello World!");
        out.println("c = " + c + " \ntesztvar = " + tesztvar);
        if(b) {
            out.println("Igaz");
        }
        else {
            out.println("Hamis");
        }
        //Az első programom java-ban.
    }
}
