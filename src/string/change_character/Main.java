package string.change_character;

import java.util.Scanner;

public class Main {
    private static final int ASCII_LOWER_CASE_MIN = 65;
    private static final int ASCII_LOWER_CASE_MAX = 90;
    private static final int ASCII_UPPER_CASE_MIN = 97;
    private static final int ASCII_UPPER_CASE_MAX = 122;
    private static final int ASCII_CASE_GAP = 32;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.print(main.asciiSolution(word));
    }

    public String solution(String word) {
        StringBuffer result = new StringBuffer();
        for (char c : word.toCharArray()) {
            result.append(Character.isUpperCase(c)
                    ? Character.toLowerCase(c)
                    : Character.toUpperCase(c));
        }
        return result.toString();
    }

    public String asciiSolution(String word) {
        StringBuffer result = new StringBuffer();
        for (char c : word.toCharArray()) {
            if (ASCII_LOWER_CASE_MIN <= c && c <= ASCII_LOWER_CASE_MAX) {
                result.append((char) (c + ASCII_CASE_GAP));
            } else if (ASCII_UPPER_CASE_MIN <= c && c <= ASCII_UPPER_CASE_MAX) {
                result.append((char) (c - ASCII_CASE_GAP));
            }
        }
        return result.toString();
    }
}
