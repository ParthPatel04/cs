import java.util.Scanner;

public class Input{
	public static void main(String[] agrs){
		System.out.println("Enter Your Name");

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		if (name.equals("Vader")){ 
			System.out.println("Hello Master, welcome to the Imperial Data Network, what can I do for you.");

		}else{	
			System.out.println("I do not know you " + name);

		}
	}
}