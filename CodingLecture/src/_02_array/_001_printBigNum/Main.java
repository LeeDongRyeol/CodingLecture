package _02_array._001_printBigNum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : m.solution(n, arr)) {
			System.out.print(x + " ");
		}
		
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		for (int i = 1; i < n; i++) {
			if(arr[i] > arr[i-1]) answer.add(arr[i]);
		}
		return answer;
	}
}
