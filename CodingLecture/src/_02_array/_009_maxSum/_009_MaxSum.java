package _02_array._009_maxSum;

import java.util.Scanner;

public class _009_MaxSum {
	public static void main(String[] args) {
		_009_MaxSum m = new _009_MaxSum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(m.solution(n, arr));
	}
	
	public static int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int dia = 0, rev = 0;
		
		for (int i = 0; i < n; i++) {
			int row = 0, col = 0;
			for (int j = 0; j < n; j++) {
				row += arr[j][i];
				col += arr[i][j];
			}
			
			dia += arr[i][i];
			rev += arr[i][n-1-i];
			
			answer = Math.max(answer, Math.max(row, col));
		}
		
		answer = Math.max(answer, Math.max(dia, rev));
		
		return answer;
	}
}
