import test.ChallengeTest;

public class Main {
    public static void main(String[] args) {
        // Create new instances of the Challenge class
        boolean[] array1 = new boolean[] {false, true, false, true, true, false, true, false, true}; // is 5
        boolean[] array2 = new boolean[] {false, false, false, false, false }; // is 0
        boolean[] array3 = new boolean[] {}; // is 0
        boolean[] array4 = new boolean[] {true, true, true}; // is 3
        boolean[] array5 = new boolean[] {false, true, false, false, false}; // is 1

        // Testing the Challenge class cases
        ChallengeTest.test(array1, 5);
        ChallengeTest.test(array2, 0);
        ChallengeTest.test(array3, 0);
        ChallengeTest.test(array4, 3);
        ChallengeTest.test(array5, 1);
    }
}
