import java.util.Scanner;

public class Input{
	public static void main(String[] agrs){
		System.out.println("Enter Your Name");

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		System.out.println("Hello " + name);
	}
}