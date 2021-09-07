package _03_twoPointer._004_seriesPartNumArr;

import java.util.Scanner;

public class SeriesPartNumArr {
	public static void main(String[] args) {
		SeriesPartNumArr T = new SeriesPartNumArr();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
	
	public static int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			
			if(sum == m) answer++;
			while(sum >= m) {
				sum -= arr[lt++];
				if(sum == m) answer++;
			}
		}
		
		return answer;
	}
	
}
