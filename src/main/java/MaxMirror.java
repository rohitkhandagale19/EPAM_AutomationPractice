public class MaxMirror {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 8, 9, 3, 2, 1};
        int[] arr2 = {1, 2, 1, 4};
        int[] arr3 = {7, 1, 2, 9, 7, 2, 1};

        System.out.println(maxMirror(arr1));
        System.out.println(maxMirror(arr2));
        System.out.println(maxMirror(arr3));
    }

    public static int maxMirror(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int start = 0; start < n; start++) {
            for (int end = n - 1; end >= 0; end--) {
                int length = 0;
                int i = start;
                int j = end;

                while (i < n && j >= 0 && nums[i] == nums[j]) {
                    length++;
                    i++;
                    j--;
                }

                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }
}
