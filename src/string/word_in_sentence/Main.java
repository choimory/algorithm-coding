package string.word_in_sentence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.print(main.solution(sentence));
    }

    public String solution(String sentence){
        String longestWord = "";
        for (String word : sentence.split(" ")) {
            longestWord = longestWord.length() < word.length()
                    ? word
                    : longestWord;
        }
        return longestWord;
    }
}
