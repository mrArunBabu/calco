import java.util.Scanner;
public class MultyTable {
	public static void main(String[]args) {
Scanner a = new Scanner(System.in);
System.out.println("enter a number to print multyplication table\n");
int number = a.nextInt();

System.out.println("the multiplication table for "+ number + " is...");

//loop to formulate the multiplication table
for(int i = 1; i <= 10; i++) {
	int result = i * number;
	System.out.println(i + "*" + number + "=" + result);
}
}
}	
