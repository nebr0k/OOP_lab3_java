import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int countAbc = countOccurrences(str1, "abc");
        String replacedStr1 = replaceAll(str1, "abc", "**");
        System.out.println("Occurrences of 'abc': " + countAbc);
        System.out.println("Replaced string: " + replacedStr1);

        int countWords = countDoubleLetters(str2);
        System.out.println("Count Double Letters: " + countWords);

        compareStrings(str1, str2);
        concatenateStrings(str1, str2);

        scanner.close();
    }

    static int countOccurrences(String input, String pattern) {
        int count = 0;
        int i = 0;
        while ((i = input.indexOf(pattern, i)) != -1) {
            count++;
            i += pattern.length();
        }
        return count;
    }

    static String replaceAll(String input, String pattern, String replacement) {
        return input.replace(pattern, replacement);
    }

    static int countDoubleLetters(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    static void compareStrings(String str1, String str2) {
        System.out.println("\nString comparison between '" + str1 + "' and '" + str2 + "':");
        System.out.println("CompareToIgnoreCase: " + str1.compareToIgnoreCase(str2));
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("== operator: " + (str1 == str2));
    }

    static void concatenateStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str1); sb.append(' '); sb.append(str2);
        String sbConcat = sb.toString();
        System.out.println("\nStringBuilder concatenation: " + sbConcat);

        String concat1 = str1 + " " + str2;
        String concat2 = str1.concat(" ").concat(str2);
        System.out.println("Operator +: " + concat1);
        System.out.println("Concat method: " + concat2);
    }
}
