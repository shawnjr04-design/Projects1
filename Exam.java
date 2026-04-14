public class Exam extends Assessment {
    private int numQuestions; // Number of questions
    private double pointsEach;  // Points for each question
    private int numMissed;   // Number of questions missed

    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / questions; // Calculate points for each question

        int numericScore = (int) ((questions - missed) * pointsEach); // Calculate numeric score
        setScore(numericScore);

    }

    public double getPointsEach() {
        return this.pointsEach;
    }
    public int getNumMissed() {
        return this.numMissed;
    }
}