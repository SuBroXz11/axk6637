package histogram;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] frequency = new int[10];

        System.out.println("Enter integers in the range 1 to 100 inclusive (enter -1 to finish):");
        int input = scanner.nextInt();
        while (input != -1) {
            if (input >= 1 && input <= 100) {
                int index = (input - 1) / 10;
                frequency[index]++;
            } else {
                System.out.println("Invalid input. Please enter an integer in the range 1 to 100.");
            }
            input = scanner.nextInt();
        }

        System.out.println("\nHistogram:");
        HistogramPrinter.printHistogram(frequency); // Using the HistogramPrinter class
        scanner.close();
    }
}

