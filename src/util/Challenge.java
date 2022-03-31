package util;
public class Challenge {

    // this method is used to iterate through the array and find the count of 'true' values using a simple for loop
    public static int countTrue(boolean[] array) {
        int count = 0;
        for (boolean b : array) {
            if (b) {
                count++;
            }
        }
        return count;
    }
}
