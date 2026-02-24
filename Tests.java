import java.util.Scanner;
public class Tests {

    private double average;
    private int count;

    public Tests() {
        average = Double.NaN;
        count = 0;
    }

    public void getAverage() {
        Scanner scnr = new Scanner(System.in);
        double sum = 0;
        count = 0;

        System.out.println("Enter test scores (-1 to quit): ");
        double score = scnr.nextDouble();

        while (score != -1) {
            sum += score;
            count++;

            System.out.println("Enter test scores (-1 to quit): ");
            score = scnr.nextDouble();
        }

        if (count > 0) {
            average = sum / count;
        } else {
            average = Double.NaN;
        }
        
    }

    @Override
    public String toString() {
        return "The average of the " + count +
               " scores entered is " +
               String.format("%.2f", average) + ".";
    }
}