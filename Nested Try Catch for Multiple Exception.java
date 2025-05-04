import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();

        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);
            System.out.println("File opened successfully.");
            fileScanner.close();

            try {
                String arrayInput = scanner.nextLine();
                String[] elements = arrayInput.split(" ");
                int[] array = new int[elements.length];

                for (int i = 0; i < elements.length; i++) {
                    array[i] = Integer.parseInt(elements[i]);
                }

                int index = scanner.nextInt();

                try {
                    int value = array[index];
                    System.out.println("Value at index " + index + ": " + value);

                    try {
                        int numerator = scanner.nextInt();
                        int denominator = scanner.nextInt();

                        int result = numerator / denominator;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException arithEx1) {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                } catch (ArrayIndexOutOfBoundsException indexEx1) {
                    System.out.println("Error: Index " + index + " is out of bounds.");

                    try {
                        int numerator = scanner.nextInt();
                        int denominator = scanner.nextInt();

                        int result = numerator / denominator;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException arithEx2) {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
            } catch (NumberFormatException numEx1) {
                System.out.println("Error: Invalid number format in the array.");
            }
        } catch (FileNotFoundException fileEx) {
            System.out.println("Error: File not found.");

            try {
                String arrayInput = scanner.nextLine();
                String[] elements = arrayInput.split(" ");
                int[] array = new int[elements.length];

                for (int i = 0; i < elements.length; i++) {
                    array[i] = Integer.parseInt(elements[i]);
                }

                int index = scanner.nextInt();

                try {
                    int value = array[index];
                    System.out.println("Value at index " + index + ": " + value);

                    try {
                        int numerator = scanner.nextInt();
                        int denominator = scanner.nextInt();

                        int result = numerator / denominator;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException arithEx3) {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                } catch (ArrayIndexOutOfBoundsException indexEx2) {
                    System.out.println("Error: Index " + index + " is out of bounds.");

                    try {
                        int numerator = scanner.nextInt();
                        int denominator = scanner.nextInt();

                        int result = numerator / denominator;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException arithEx4) {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
            } catch (NumberFormatException numEx2) {
                System.out.println("Error: Invalid number format in the array.");
            }
        } finally {
            scanner.close();
        }
    }
}
