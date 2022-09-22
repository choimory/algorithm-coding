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

    public void mission(){
        /*1. 대소문자가 혼용된 단어를 입력받아라 - aAzZasdfWEQfqwdfasdf*/
        /*2. 대문자는 소문자로, 소문자는 대문자로 변형하여 출력하라 - AaZzASDFweqFQWDFASDF*/
    }

    public String solution(String word) {
        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            result.append(Character.isUpperCase(c)
                    ? Character.toLowerCase(c)
                    : Character.toUpperCase(c));
        }
        return result.toString();
    }

    public String asciiSolution(String word) {
        StringBuilder result = new StringBuilder();
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
