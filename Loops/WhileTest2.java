import java.util.Scanner;

public class WhileTest2{
	public static void main(String[] agrs){
		System.out.println("Give me a number");	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int counter=0;

		while(counter < num){
			System.out.println(counter);

			counter= counter+1;
		}
	}
}