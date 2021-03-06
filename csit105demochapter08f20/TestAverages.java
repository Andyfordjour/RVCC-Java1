package csit105demochapter08f20;

import java.io.*;    // Needed for IOException

/**
 * This program uses the TestScoreReader class to read test scores from a file
 * and get their averages.
 *
 * @author Tony Gaddis (et al)
 */
public class TestAverages {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws IOException {
        double average;           // To hold an average
        int studentNumber = 1;    // To count students

        // Create a TestScoreReader object.
        TestScoreReader scoreReader
                = new TestScoreReader("Grades.csv");

        // Process the file contents.
        while (scoreReader.readNextLine()) {
            // Get this student's average.
            average = scoreReader.getAverage();

            // Display this student's average.
            System.out.println("Average for student number "
                    + studentNumber + " is "
                    + average);

            // Increment the student number.
            studentNumber++;
        }

        // Close the file.
        scoreReader.close();
        System.out.println("No more scores.");
    }
}
