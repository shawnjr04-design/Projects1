// This class tests all methods in the Calc class
// The Calc class exposes the following methods:
// Add, subtract, multiply, divide
// The user is prompted for input
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        // Instantiate a Calc object
        Calc myCalculator = new Calc();

        Scanner scan = new Scanner(System.in);
        // New code (Enhancements)
        double n1;
        double n2;
        
        while (true) {
            System.out.println("Please enter the first number: ");

            if (scan.hasNextDouble()) {
                n1 = scan.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scan.next();
            }

        }
        while (true) {
            System.out.println("Please enter the second number: ");
             if (scan.hasNextDouble()) {
                n2 = scan.nextDouble();
                break;
             } else {
                System.out.println("Invalid input. Please enter a number.");
                scan.next();
             }
        }
        

        // Pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // Output from Calc instance
        System.out.println(myCalculator);

        // Examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        // Calling Calc methods directly
        // Can use a local variable for sum if you need that value for another calculation
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        // If you don't, then just display the difference, product and quotient
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}
