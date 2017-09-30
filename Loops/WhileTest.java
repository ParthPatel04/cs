import java.util.Scanner;

public class WhileTest{
	public static void main(String[] agrs){
		System.out.println("Give me a number");	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int counter=0;

		while(counter < num){
			counter= counter+1;
			System.out.println("Hello");
		}
	}
}