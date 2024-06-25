import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 232, 32, 23, 54);

        Iterator<Integer> itr = nums.iterator();

        while (itr.hasNext()) {
            int num = itr.next();
            System.out.println(num);
        }


    }
}
