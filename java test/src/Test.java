import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();
        
        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }
        
        int midRow = rows / 2 + 1;
        
        // Print upper half of the diamond
        for(int i = 1; i <= midRow; i++) {
            // Print spaces
            for(int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
        
        // Print lower half of the diamond
        for(int i = midRow - 1; i >= 1; i--) {
            // Print spaces
            for(int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
