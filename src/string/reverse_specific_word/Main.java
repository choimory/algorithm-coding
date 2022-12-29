package string.reverse_specific_word;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.print(main.mySolution(input));
    }

    private void mission(){
        /*설명
        영어 알파벳과 특문으로 구성된 문자열이 주어지면
        영어 알파벳만 뒤집고 특문은 자기 자리에 그대로 있는 문자열을 만들어 출력

        입력
        첫줄에 길이가 100을 넘지 않는 문자열

        출력
        첫줄에 알파벳만 뒤집힌 문자열

        예
        a#b!GE*T@S
        S#T!EG*b@a*/
    }

    public String mySolution(String word){
        int lastIndex = word.length()-1;

        char[] input = word.toCharArray();
        char[] result = new char[input.length];

        for (int i = 0; i < input.length; i++) {
            /*특문여부 체크*/
            if(!Character.isAlphabetic(input[i])) {
                //특문일시 인덱스 그대로
                result[i] = input[i];
            }else {
                //특문 아닐시 인덱스 반대로
                result[lastIndex - i] = input[i];
            }
        }

        return new String(result);
    }

    public String solution(String word){
        return "";
    }
}
