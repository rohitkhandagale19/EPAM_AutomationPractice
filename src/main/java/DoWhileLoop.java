import java.util.Scanner;

public class DoWhileLoop {
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
        int row = 1;
        do {
            int column = 1;

            do {

                System.out.print(currentNumber + "\t");
                currentNumber += incrementBy;
                column++;
            } while (column <= row);

            System.out.println();
            row++;
        } while (row <= numberOfRows);


    }
}
