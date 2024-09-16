package histogram;

public class HistogramPrinter {
    public static void printHistogram(int[] frequency) {
        for (int i = 0; i < 10; i++) {
            int lowerBound = i * 10 + 1;
            int upperBound = (i + 1) * 10;
            System.out.print(lowerBound + " - " + upperBound + "| ");
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

