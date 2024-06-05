import java.util.Scanner;
public class StrarTriangle {
	public static void main(String[]args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the number of raws");
		int raw = a.nextInt();
		
		// loop to print stars
		for(int i = 0; i < raw; i++) {
			for (int j = 0; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}

}
