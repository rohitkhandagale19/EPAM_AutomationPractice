public class TicketComputing {
    public static void main(String[] args) {
        int speed = 85;
        boolean isBirthday = false;
        int result = caughtSpeeding(speed, isBirthday);

        System.out.println("Ticket result: " + result);
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int limit = isBirthday ? 5 : 0;
        int result = 0;
        if (speed > 60 + limit && speed <= 80 + limit) {
            result = 1;
        } else if (speed > 80 + limit) {
            result = 2;
        }
        return result;
    }
}
