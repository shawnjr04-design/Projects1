import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {

        public static void main(String[] args)
        {
            String input;     // To hold input
            int questions = 0;    // Number of questions
            int missed = 0; 
            
            try {// Number of questions missed

            // Get the number of questions on the exam
            input = JOptionPane.showInputDialog("How many questions are on the exam?");
            questions = Integer.parseInt(input);

            // Get the number of questions the student missed
            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            missed = Integer.parseInt(input);

            if (questions == 0) {
                throw new ArithmeticException("Number of questions can't be zero.");
            }

            // Create an Exam object
            Exam exam = new Exam(questions, missed);

            // Display the test results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);

        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Math error: " + e.getMessage());
            
        }
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                "Error: Can't divide by zero or exam setup is invalid.");
            
        }

            System.exit(0);
        }
    }


