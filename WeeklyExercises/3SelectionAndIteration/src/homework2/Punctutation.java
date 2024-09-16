package homework2;

public class Punctutation {
	public static void main(String[] args) {
        String str = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
        int[] punctuationCounts = countPunctuation(str);
        System.out.println("Symbol\tCount");
        // Loop through the array to print the counts of each punctuation mark
        for (int i = 0; i < punctuationCounts.length; i++) {
            char punctuation = getPunctuationAtIndex(i);
            int count = punctuationCounts[i];
            System.out.println(punctuation + "\t" + count);
        }
    }

    public static int[] countPunctuation(String str) {
        int[] punctuationCounts = new int[getPunctuationCount()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = getPunctuationIndex(ch);
            if (index != -1) {
                punctuationCounts[index]++;
            }
        }
        return punctuationCounts;
    }

    public static char getPunctuationAtIndex(int index) {
        // Define the array of punctuation marks
        char[] punctuationMarks = {'.', ',', ';', ':', '!', '?', '(', ')', '[', ']', '{', '}', '\'', '\"', '-', '_', '/', '\\'};
        // Return the punctuation mark at the specified index
        return punctuationMarks[index];
    }

    public static int getPunctuationCount() {
        // Return the number of punctuation marks
        return 18; // Change this value if you add or remove punctuation marks
    }

    public static int getPunctuationIndex(char ch) {
        // Define the array of punctuation marks
        char[] punctuationMarks = {'.', ',', ';', ':', '!', '?', '(', ')', '[', ']', '{', '}', '\'', '\"', '-', '_', '/', '\\'};
        // Loop through the array to find the index of the given punctuation mark
        for (int i = 0; i < punctuationMarks.length; i++) {
            if (ch == punctuationMarks[i]) {
                return i;
            }
        }
        // Return -1 if the given character is not a punctuation mark
        return -1;
    }
}
