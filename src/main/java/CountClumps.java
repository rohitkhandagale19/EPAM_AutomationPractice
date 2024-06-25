public class CountClumps {

    public static void main(String[] args) {
        int[] test1 = {1, 2, 2, 3, 4, 4, 3, 3};
        int[] test2 = {1, 1, 2, 1, 1};
        int[] test3 = {1, 1, 1, 1, 1};

        System.out.println("Clumps in [1, 2, 2, 3, 4, 4, 3, 3]: " + countClumps(test1));
        System.out.println("Clumps in [1, 1, 2, 1, 1]: " + countClumps(test2));
        System.out.println("Clumps in [1, 1, 1, 1, 1]: " + countClumps(test3));
    }

    public static int countClumps(int[] nums) {
        int clumpCount = 0;
        boolean isClump = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !isClump) {
                clumpCount++;
                isClump = true;
            } else if (nums[i] != nums[i + 1]) {
                isClump = false;
            }
        }

        return clumpCount;
    }
}
