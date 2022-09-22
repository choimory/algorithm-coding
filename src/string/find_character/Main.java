package string.find_character;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toUpperCase(Locale.ROOT);
        String target = scanner.next().toUpperCase(Locale.ROOT);
        System.out.print(main.solution(word, target));
    }

    public int solution(String word, String target){
        int result = 0;
        for (char c : word.toCharArray()) {
            if(c == target.toCharArray()[0]){
                result++;
            }
        }
        return result;
    }
}
