package string.change_character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.print(main.solution(word));
    }

    public String solution(String word){
        StringBuffer result = new StringBuffer();
        for (char c : word.toCharArray()) {
            result.append(Character.isUpperCase(c)
                    ? Character.toLowerCase(c)
                    : Character.toUpperCase(c));
        }
        return result.toString();
    }
}
