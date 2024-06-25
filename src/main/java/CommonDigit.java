public class CommonDigit {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;

        boolean hasCommonDigit = shareDigit(a, b);
        System.out.println("Do the numbers have a common digit? " + hasCommonDigit);
    }

    public static boolean shareDigit(int a, int b) {
        int aLeftDigit = a / 10;
        int aRightDigit = a % 10;
        int bLeftDigit = b / 10;
        int bRightDigit = b % 10;

        return (aLeftDigit == bLeftDigit || aLeftDigit == bRightDigit ||
                aRightDigit == bLeftDigit || aRightDigit == bRightDigit);
    }
}
