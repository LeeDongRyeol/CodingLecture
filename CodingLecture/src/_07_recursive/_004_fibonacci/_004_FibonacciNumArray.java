package _07_recursive._004_fibonacci;

import java.util.Scanner;

public class _004_FibonacciNumArray {
	public static void main(String[] args) {
		_004_FibonacciNumArray T = new _004_FibonacciNumArray();
		Scanner sc = new Scanner(System.in);
		System.out.println(T.solution(sc.nextInt()));
	}
	
	public static int solution(int n) {
		if(n <= 2) return 1;
		else return solution(n-1) + solution(n-2);
	}
}
