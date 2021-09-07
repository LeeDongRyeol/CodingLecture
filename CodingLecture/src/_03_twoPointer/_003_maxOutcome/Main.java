package _03_twoPointer._003_maxOutcome;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(m.solution(n, k, arr));
	}
	
	public static int solution(int n, int k, int[] arr) {
		int answer = 0;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			if(i >= k) sum += arr[i] - arr[i-k];
			else sum += arr[i];
			
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}
}
