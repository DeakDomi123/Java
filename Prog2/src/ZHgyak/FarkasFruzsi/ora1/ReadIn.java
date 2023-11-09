import java.io.Console;

public class ReadIn {

	public static void main(String[] args) {
		
		Console c = System.console();
		for (int i = 0; i < 3; i++) {
			System.out.println("Please enter a String:");
			String s = c.readLine();
			System.out.println("The given String was: " + s);
		}
	}
}