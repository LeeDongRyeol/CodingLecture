package _003_wordInSentence;

import java.util.Scanner;

/**
 * 
 * @author dr854
 * 
 * 3. 문장 속 단어
설명

한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

문장속의 각 단어는 공백으로 구분됩니다.


입력
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.


출력
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한

단어를 답으로 합니다.


예시 입력 1 

it is time to study
예시 출력 1

study
 *
 */

public class _003_WordInSentence {
	public static void main(String[] args) {
		_003_WordInSentence m = new _003_WordInSentence();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(m.solution(str));
	}
	
	public static String solution(String str) {
		String[] arr = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i].length() < arr[j].length()
						|| (arr[i].length() == arr[j].length()
								&& arr[i].compareTo(arr[j]) < 1)) {
					arr = swap(arr, i, j);
				}
			}
		}
		
		return arr[0];
	}
	
	public static String[] swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
