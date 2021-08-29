package _003_wordInSentence;

import java.util.Scanner;

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
