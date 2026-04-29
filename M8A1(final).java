//Shawn Morgan
// 4/29/2026 (Sorry this took soo long)
import java.io.*;
import java.text.DecimalFormat;

// Here is my PayCalculator class with appropriate constructors and methods
class PayCalculator {
    private double payRate;
    private double hours;

    public PayCalculator(double payRate, double hours) {
        this.payRate = payRate;
        this.hours = hours;
    }

    public double calculateWeeklyPay() {
        if (hours > 40) {
            return (40 * payRate) + ((hours - 40) * payRate * 1.5);
        } else {
            return hours * payRate;
        }
    }
}

public class M8A1 {
    public static void main(String[] args) throws IOException {

        String inputFile = "pay.csv";
        String outputFile = "output.csv";
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){


        writer.write("EmpID,Rate,Hours,Weekly Pay");
        writer.newLine();

        reader.readLine();

        String line;

        while ((line = reader.readLine()) != null) {

            String[] parts = line.split(",");

            if (parts.length < 3) {
                continue;
            }

            String empId = parts[0];
            double payRate = Double.parseDouble(parts[1].trim());
            double hours = Double.parseDouble(parts[2].trim());

            PayCalculator calc = new PayCalculator(payRate, hours);
            double weeklyPay = calc.calculateWeeklyPay();

            String formattedPay = df.format(weeklyPay);

            String outputLine = empId + "," + payRate + "," + hours + "," + formattedPay;

            writer.write(outputLine);
            writer.newLine();
        }


        System.out.println("Done writing to output.csv");
    }
}
}