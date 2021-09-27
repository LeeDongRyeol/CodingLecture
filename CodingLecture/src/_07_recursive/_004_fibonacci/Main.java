package _07_recursive._004_fibonacci;

import java.util.Scanner;

public class Main {
	static int[] fibo;
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo = new int[n+1];
		T.dfs(n);
		for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
	}
	
	public static int dfs(int n) {
		if(fibo[n] > 0) return fibo[n];
		if(n == 1) {
			return fibo[n] = 1;
		} else if(n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = dfs(n-1) + dfs(n-2);
		}
	}
}
