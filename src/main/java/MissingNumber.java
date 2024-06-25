public class MissingNumber {
    public static void main(String[] args) {
        int[] array = new int[99];
        int missingNumber = 43;
        for (int i = 0, j = 1; j <= 100; j++) {
            if (j == missingNumber) {
                continue;
            }
            array[i++] = j;
        }

        int n = array.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("The missing number is: " + missing);
    }
}
