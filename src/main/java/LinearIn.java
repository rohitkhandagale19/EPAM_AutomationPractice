public class LinearIn {

    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }
        if (outer.length == 0) {
            return false;
        }

        int i = 0, j = 0;

        while (i < outer.length && j < inner.length) {
            if (outer[i] == inner[j]) {
                j++;
            }
            i++;
        }

        return j == inner.length;
    }
}
