import java.util.Scanner;
public class Class21 {
    public static void main(String args[]) {
    	 
        Class23 obj = new Class23();
        Scanner s = new Scanner (System.in);
        
        
        System.out.println("enter two numbers");
       
        int num1 = s.nextInt();
        int num2 = s.nextInt();
       

        obj.sum(num1, num2);
        obj.displaysum();
        obj.multiplication(num1,num2);
        obj.displaymulti();
        
    }
}

