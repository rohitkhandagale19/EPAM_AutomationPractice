public class MaxSpan {

    public static void main(String[] args) {
        int[] test1 = {1, 2, 1, 1, 3};
        int[] test2 = {1, 4, 2, 1, 4, 1, 4};
        int[] test3 = {1, 4, 2, 1, 4, 4, 4};

        System.out.println("Max Span of [1, 2, 1, 1, 3]: " + maxSpan(test1));
        System.out.println("Max Span of [1, 4, 2, 1, 4, 1, 4]: " + maxSpan(test2));
        System.out.println("Max Span of [1, 4, 2, 1, 4, 4, 4]: " + maxSpan(test3));
    }

    public static int maxSpan(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    if (span > maxSpan) {
                        maxSpan = span;
                    }
                    break;
                }
            }
        }
        return maxSpan;
    }
}
