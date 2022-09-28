package dfs_and_bfs.subset_of_equal_sums;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 합이 같은 부분 집합
 */
public class Main {
    public static void mission(){
        /*N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두개의 부분집합으로 나누었을때
        두 부분집합의 원소의 합이 서로 같을시 YES, 아니면 NO를 출력*/

        /*e.g.
        첫번째 줄 6
        두번째 줄 1 3 5 6 7 10
        일시 {1+3+5+7} = {6+10}이므로 YES*/
        //-----

        /*첫번째줄에 원소의 갯수가 N이 주어진다 (1 <= N <= 10) */
        /*두번째줄에 원소 N개가 주어진다, 각 원소는 중복되지 않는다*/
        /*첫번째줄에 YES or NO를 출력한다*/
    }

    public static String answer = "NO";
    public static int size = 0;
    public static int total = 0;
    public boolean flag = false;

    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        size = scanner.nextInt();
        scanner.nextLine();
        List<Integer> elements = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();
        total = elements.stream()
                .reduce(Integer::sum)
                .orElse(0);

        main.solution(0, 0, elements);
        System.out.print(answer);

    }

    public void solution(int level, int sum, List<Integer> elements){
        if( flag || (sum > total/2) ) return;

        if(level == size){
            if((total - sum) == sum){
                answer = "YES";
                flag = true;
            }
        } else {
           solution(level + 1, sum + elements.get(level), elements);
           solution(level + 1, sum, elements);
        }
    }
}
