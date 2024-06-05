import java.util.Scanner;

public class IfSample {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
		int number = sc.nextInt();
		
		if(number < 0) {
			System.out.println("the number is negative");
		} else {
			System.out.println("the number is positive");
		}
	}
}
