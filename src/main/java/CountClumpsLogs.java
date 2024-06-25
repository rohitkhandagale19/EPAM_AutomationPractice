import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CountClumpsLogs {

    private static final Logger logger = LogManager.getLogger(CountClumpsLogs.class);

    public static void main(String[] args) {
        int[] test1 = {1, 2, 2, 3, 4, 4, 3, 3};
        int[] test2 = {1, 1, 2, 1, 1};
        int[] test3 = {1, 1, 1, 1, 1};
        int[] test4 = {};

        logger.info("Starting clump count calculations.");

        logger.debug("Test array 1: Clumps count: {}", countClumps(test1));
        logger.debug("Test array 2: Clumps count: {}", countClumps(test2));
        logger.debug("Test array 3: Clumps count: {}", countClumps(test3));

        if (test4.length < 1) {
            logger.error("Test array 4 length is less than 1: {}", test4.length);
        }

        if (test2.length > Integer.MAX_VALUE) {
            logger.warn("Test array 2 length is less than 5: {}", test2.length);
        }

        logger.info("Finished clump count calculations.");
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
