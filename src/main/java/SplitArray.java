public class SplitArray {

    public static void main(String[] args) {
        int[] test1 = {1, 1, 1, 2, 1};
        int[] test2 = {2, 1, 1, 2, 1};
        int[] test3 = {10, 10};

        System.out.println("Can split [1, 1, 1, 2, 1]: " + canBalance(test1));
        System.out.println("Can split [2, 1, 1, 2, 1]: " + canBalance(test2));
        System.out.println("Can split [10, 10]: " + canBalance(test3));
    }

    public static boolean canBalance(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (runningSum * 2 == totalSum) {
                return true;
            }
        }
        return false;
    }
}
