package _06_sort._004_lru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author dyl1912
 *
 *입력
첫 번째 줄에 캐시의 크기인 S(3<=S<=10)와 작업의 개수 N(5<=N<=1,000)이 입력된다.

두 번째 줄에 N개의 작업번호가 처리순으로 주어진다. 작업번호는 1 ~100 이다.


출력
마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례로 출력합니다.


예시 입력 1 

5 9
1 2 3 2 6 2 3 5 7
예시 출력 1

7 5 3 2 6
 */

public class _004_LRU {
	public static void main(String[] args) {
		_004_LRU T = new _004_LRU();
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt(), n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : T.solution(s, n, arr)) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] solution(int s, int n, int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int num = arr[i];
			
			if(list.contains(num)) list.remove(list.indexOf(num));
			list.add(num);
			if(list.size() > s) list.remove(0);
		}
		
		Collections.reverse(list);
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
