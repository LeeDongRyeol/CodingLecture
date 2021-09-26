package _07_recursive._003_factorial;

import java.util.Scanner;

public class _003_Factorial {
	public static void main(String[] args) {
		_003_Factorial T = new _003_Factorial();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.factorial(n));
	}
	
	public static int factorial(int n) {
		if(n == 1) return 1;
		else return n*factorial(n-1);
	}
}
