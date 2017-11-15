import java.util.Scanner;

public class ForTest{
	public static void main(String[] agrs){
		System.out.println("Give me a number");	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int counter = 0; counter < num; counter++) {
			System.out.println("Hello"); 
		
		}
	}
}