package _10_dp._002_stoneBridge;

import java.util.Scanner;

public class _002_StoneBridge {
	static int[] arr;
	
	public static int solution(int n) {
		arr[1] = 1;
		arr[2] = 2;
		
		for (int i = 3; i <= n+1; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		return arr[n+1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n+2];
		System.out.println(solution(n));
	}
}
