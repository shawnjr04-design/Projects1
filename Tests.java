// Shawn Morgan 2/2/2026
// The video confused me a bit, but I think the video was mainly just giving us an example of what to do but, not
// exactly how we should do it right? 

public class ShawnsTestScores {
    public static void main(String[] args) {
        // These are the 3 variables that hold decimal test scores. I made the numbers random
        double score1 = 91.5;
        double score2 = 67.1;
        double score3 = 80.5;

        // This calculates the average of the 3 scores
        double average = (score1 + score2 + score3) / 3;

        // This will display the test scores and the average of the 3 test scores
        System.out.println("Test score 1:   " + score1);
        System.out.println("Test score 2:  " + score2);
        System.out.println("Test score 3:  " + score3);
        System.out.printf("The average of 3 test scores is:  %.2f", average);
    }
}