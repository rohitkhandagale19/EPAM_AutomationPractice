public class GreatNumber {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;

        boolean isGreatNumber = (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
        System.out.println(isGreatNumber);
    }
}
