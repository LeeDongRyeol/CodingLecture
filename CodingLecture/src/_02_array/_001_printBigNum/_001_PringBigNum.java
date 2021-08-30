package _02_array._001_printBigNum;

import java.util.Scanner;

/**
 * 
 * @author dr854
 *
 *
 *1. 큰 수 출력하기
설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.


예시 입력 1 

6
7 3 9 5 6 12
예시 출력 1

7 9 6 12
 *
 */

public class _001_PringBigNum {
	public static void main(String[] args) {
		_001_PringBigNum m = new _001_PringBigNum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(m.solution(n, arr));
	}
	
	public static String solution(int n, int[] arr) {
		String answer = "";
		
		for (int i = 0; i < arr.length; i++) {
			if(i == 0) {
				answer += arr[i] + " ";
			} else {
				if(arr[i-1] < arr[i]) answer += arr[i] + " ";
			}
		}
		
		return answer;
	}
}
