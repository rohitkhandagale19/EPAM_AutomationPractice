import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int numberOfRows = scanner.nextInt();
        System.out.print("Enter X: ");
        int incrementBy = scanner.nextInt();
        scanner.close();

        if (numberOfRows <= 0 || incrementBy <= 0) {
            System.out.println("Number of rows and increment value must be positive integers.");
            return;
        }

        int currentNumber = 0;
        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(currentNumber + "\t");
                currentNumber += incrementBy;
            }
            System.out.println();
        }
    }
}
