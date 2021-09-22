package _07_recursive._001_recursive;

import java.util.Scanner;

public class _001_Recursive {
	public static void main(String[] args) {
		_001_Recursive T = new _001_Recursive();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solution(n);
	}
	
	public static void solution(int n) {
		if(n > 1) solution(n-1);
		System.out.print(n + " ");
	}
}
