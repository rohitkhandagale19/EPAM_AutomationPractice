public class LargestBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
    }

    public static int maxBlock(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int maxBlockLength = 1;
        int currentBlockLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentBlockLength++;
            } else {
                if (currentBlockLength > maxBlockLength) {
                    maxBlockLength = currentBlockLength;
                }
                currentBlockLength = 1; // Reset for a new block
            }
        }

        // Final check in case the longest block is at the end of the string
        if (currentBlockLength > maxBlockLength) {
            maxBlockLength = currentBlockLength;
        }

        return maxBlockLength;
    }
}
