package string.word_in_sentence;

import java.util.Scanner;

/**
 * 문장 속 가장 긴 단어 찾기
 */
public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.print(main.solution(sentence));
    }

    public void mission(){
        /*1.여러 단어가 섞인 문장을 입력받아라, 단 단어는 띄어쓰기로 구분한다 - hi my name is choimory*/
        /*2. 1중 가장 길이가 긴 단어를 출력하라, 단 길이가 같을시 먼저 입력된 단어를 출력하라 - choimory*/
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
