package function;

import java.util.Scanner;

public class Function1 {
	public static void main(String aw[]) {
		System.out.println("enter two numbers");
		Scanner x = new Scanner(System.in);
		int num1 = x.nextInt();
		int num2 = x.nextInt();
		
		int result = sum(num1, num2);
		System.out.println("the sum of the two number is " + result);
	}
	
	static int sum(int a, int b) {
		int s = a + b;
		return s;
	}

}
