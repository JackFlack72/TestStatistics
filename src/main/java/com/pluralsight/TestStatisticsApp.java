package com.pluralsight;

public class TestStatisticsApp {
    public static void main(String[] args) {
        int[] testScores = {87,94,85,71,25,86,53,48,56,87};

        int sum = 0;
        for (int i=0; i<10; i++){
            sum = sum + testScores[i];
        }
        int average = sum/10;

        int highScore = testScores[0];
        for (int j=0; j<10; j++) {
            if (testScores[j] > highScore) {
                highScore = testScores[j];
            }
        }

        int lowScore = testScores[0];
        for (int k=0; k<10; k++){
            if (testScores[k] < lowScore) {
                lowScore = testScores[k];
            }
        }

        System.out.printf("""
                Average: %d
                High Score: %d
                Low Score: %d
                """,average,highScore,lowScore);

        /* Easier way to find largest and smallest value in an array
        Arrays.sort(testScores);

        int low = testScores[0];
        int high = testScores[last index];
         */
    }
}
