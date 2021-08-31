package _02_array._004_fibonacci;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
//		for(int n : m.solution(sc.nextInt())) {
//			System.out.print(n + " ");
//		}
		solution(sc.nextInt());
	}
	
//	public static int[] solution(int n) {
//		int[] answer = new int[n];
//		answer[0] = 1; answer[1] = 1;
//		for (int i = 2; i < answer.length; i++) {
//			answer[i] = answer[i-2] + answer[i-1];
//		}
//		
//		return answer;
//	}
	
	public static void solution(int n) {
		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b; b = c;
		}
	}
}
