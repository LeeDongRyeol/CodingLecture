package _08_dfsBfs._007_combinationNum;

import java.util.Scanner;

public class _007_CombinationNum {
	static int[][] arr = new int[35][35];
	
	public static int dfs(int n, int r) {
		if(arr[n][r] > 0) return arr[n][r];
		if(n == r || r == 0) return 1;
		else return arr[n][r] = dfs(n-1, r-1) + dfs(n-1, r);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), r = sc.nextInt();
		System.out.println(dfs(n,r));
		sc.close();
	}
}
