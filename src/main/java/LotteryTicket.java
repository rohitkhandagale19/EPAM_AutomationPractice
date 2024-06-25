public class LotteryTicket {

    public static void main(String[] args) {
        int a = 13, b = 9, c = 3;
        int result = checkTicket(a, b, c);
        System.out.println("Result: " + result);
    }

    public static int checkTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) {
            return 10;
        } else if (a + b == b + c + 10 || a + b == a + c + 10) {
            return 5;
        }
        return 0;
    }
}
