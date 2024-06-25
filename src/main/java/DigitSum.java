public class DigitSum {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(sumLimit(a, b));
    }

    public static int sumLimit(int a, int b) {
        String strA = String.valueOf(a);
        String strSum = String.valueOf(a + b);

        if (strSum.length() != strA.length()) {
            return a;
        } else {
            return a + b;
        }
    }
}
