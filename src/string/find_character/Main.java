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

    public void mission(){
        /*1. 여러개의 영문자를 입력받아라 - asdcascecwecasdc*/
        /*2. 갯수를 확인할 알파벳 한글자를 입력받아라 - c*/
        /*3. 1번에서 2번 알파벳이 포함된 갯수를 출력하라 - 5*/
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
