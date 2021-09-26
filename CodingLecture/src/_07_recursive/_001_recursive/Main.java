package _07_recursive._001_recursive;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		DFS(3);
	}
	
	public static void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
}
