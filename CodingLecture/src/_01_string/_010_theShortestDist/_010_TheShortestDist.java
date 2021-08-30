package _01_string._010_theShortestDist;

import java.util.Arrays;
import java.util.Scanner;

/***
 * 
 * @author dyl1912
 *
 *
 *10. 가장 짧은 문자거리
설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


예시 입력 1 

teachermode e
예시 출력 1

1 0 1 2 1 0 1 2 2 1 0
 */

public class _010_TheShortestDist {
	public static void main(String[] args) {
		_010_TheShortestDist m = new _010_TheShortestDist();
		Scanner sc = new Scanner(System.in);
		System.out.println(m.solution(sc.next() , sc.next().charAt(0)));
	}
	
	public static String solution(String str, char e) {
		String answer = "";
		
		char[] temp = str.toCharArray();
		int[] arr = new int[temp.length];
		
		Arrays.fill(arr, Integer.MAX_VALUE);
		
		for (int i = 0; i < arr.length; i++) {
			if(temp[i] == e) arr[i] = 0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(str.charAt(j) == e) {
					for (int j2 = 0; j2 < j; j2++) {
						arr[j2] = Math.min(arr[j2], (int)Math.abs(j2 - j));
					}
					
					for (int j2 = arr.length-1; j2 >= 0; j2--) {
						arr[j2] = Math.min(arr[j2], (int)Math.abs(j2 - j));
					}
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i] + " ";
		}
		
		return answer;
	}
}
