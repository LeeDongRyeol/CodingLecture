package _07_recursive._002_binaryPrint;

import java.util.Scanner;

public class _002_BinaryPrint {
	public static void main(String[] args) {
		_002_BinaryPrint T = new _002_BinaryPrint();
		Scanner sc = new Scanner(System.in);
		dfs(sc.nextInt());
	}
	
	public static void dfs(int n) {
		if(n > 1) dfs(n/2);
		System.out.print(n % 2 + " ");
	}
}
