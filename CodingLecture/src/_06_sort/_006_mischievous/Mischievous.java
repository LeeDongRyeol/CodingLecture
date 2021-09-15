package _06_sort._006_mischievous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mischievous {
	public static void main(String[] args) {
		Mischievous T = new Mischievous();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : T.solution(n, arr)) {
			System.out.print(i + " ");
		}
	}
	
	public static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] temp = arr.clone();
		Arrays.sort(temp);
		
		for (int i = 0; i < n; i++) {
			if(arr[i] != temp[i]) list.add(i+1);
		}
		
		return list;
	}
}
