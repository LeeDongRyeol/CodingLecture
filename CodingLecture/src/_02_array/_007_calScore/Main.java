package _02_array._007_calScore;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(m.solution(n, arr));
	}
	
	public static int solution(int n, int[] arr) {
		int answer = 0, cnt = 0;
		
		for (int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
			} else cnt = 0;
		}
		
		return answer;
	}
}
