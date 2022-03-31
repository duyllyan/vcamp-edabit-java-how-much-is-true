package test;

import util.Challenge;

public class ChallengeTest {

    // count the number of the test case
    private static int testNum = 1;

    // this method is used to test the Challenge method Challenge.countTrue and show the result in console
    public static void test(boolean[] testCase, int expected) {
        System.out.println("Test Case (" + testNum);
        int found = Challenge.countTrue(testCase);
        if (found == expected) {
            System.out.println("Test passed: expected " + expected + " found " + found + "\n");
        } else {
            System.out.println("Test failed: expected " + expected + " found " + found + "\n");
        }
        testNum++;
    }
}
