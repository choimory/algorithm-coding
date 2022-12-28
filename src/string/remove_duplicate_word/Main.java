package string.remove_duplicate_word;

import java.util.Scanner;

/**
 * 중복 문자 제거
 */
public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        System.out.println(main.solution(word));
    }

    private void mission(){
        /*설명
        소문자로 된 한개의 문자열이 입력되면 중복 문자를 제거하고 출력하라
        중복 제거된 문자열은 원래 순서를 유지함*/

        /*입력
        문자열이 한번 입력된다
        문자열의 길이는 100을 넘지 않음*/

        /*출력
        중복문자가 제거된 문자열 출력*/

        /*예
        입력 ksekkset
        출력 kset*/
    }

    public String solution(String input){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if(input.indexOf(input.charAt(i)) == i){
                stringBuilder.append(input.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
