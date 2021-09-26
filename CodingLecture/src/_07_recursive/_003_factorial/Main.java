package _07_recursive._003_factorial;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println(T.dfs(sc.nextInt()));
	}
	
	public static int dfs(int n) {
		if(n == 1) return 1;
		else return n*dfs(n-1);
	}
}
