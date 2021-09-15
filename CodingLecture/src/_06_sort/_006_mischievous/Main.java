package _06_sort._006_mischievous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
		
		for(int i : T.solution(n, arr)) {
			System.out.print(i + " ");
		}
	}
	
	public static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] temp = arr.clone();
		Arrays.sort(temp);

		for (int i = 0; i < n; i++) {
			if(arr[i] != temp[i]) answer.add(i+1);
		}
		
		return answer;
	}
}
