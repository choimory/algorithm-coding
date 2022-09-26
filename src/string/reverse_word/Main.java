package string.reverse_word;

import java.util.Scanner;

/**
 * 단어 뒤집기
 */
public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scanner.next();
        }

        for (String word : words) {
            System.out.println(main.rawSolution(word));
        }
    }

    public void mission(){
        /*1. 입력할 단어 갯수 정수를 입력받아라*/
        /*2. 1만큼 단어를 입력받아라*/
        /*3. 입력한 모든 2의 단어들을 뒤집어 출력하라*/
    }

    public String solution(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse()
                .toString();
    }

    public String rawSolution(String word){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }
}
