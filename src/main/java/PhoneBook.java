import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            if (isValidPhoneNumber(phoneNumber)) {
                phoneBook.put(name, phoneNumber);
            } else {
                System.out.println("Invalid phone number format: " + phoneNumber);
            }
        }

        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                boolean found = false;
                for (String key : phoneBook.keySet()) {
                    if (key.startsWith(query)) {
                        System.out.println(key + "=" + phoneBook.get(key));
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Not found");
                }
            }
        }
        scanner.close();
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[1-9]\\d{7}");
    }
}
