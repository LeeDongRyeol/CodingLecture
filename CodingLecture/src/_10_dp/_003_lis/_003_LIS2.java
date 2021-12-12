package _10_dp._003_lis;

import java.util.Scanner;

public class _003_LIS2 {
	public static int solution(int[] arr) {
		int answer = 0;
		int[] tmp = new int[arr.length];
		tmp[0] = 1;
		
		for (int i = 1; i < tmp.length; i++) {
			int max = 0;
			for (int j = i-1; j >= 0; j--) {
				if(arr[i] > arr[j] && tmp[j] > max) max = tmp[j];
			}
			tmp[i] = max + 1;
			answer = Math.max(answer, tmp[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(arr));
	}
}
