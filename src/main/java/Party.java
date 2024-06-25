public class Party {
    public static void main(String[] args) {
        int tea = 4;
        int candy = 10;
        int result = partyOutcome(tea, candy);

        System.out.println("Party outcome: " + result);
    }

    public static int partyOutcome(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        } else {
            return 1;
        }
    }
}
