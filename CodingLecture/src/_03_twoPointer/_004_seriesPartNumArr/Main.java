package _03_twoPointer._004_seriesPartNumArr;

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
		int answer = 0, sum = 0, lt=0;
		
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if(sum == k) answer++;
			while(sum >= k) {
				sum -= arr[lt++];
				if(sum == k) answer++;
			}
		}
		
		return answer;
	}
}
