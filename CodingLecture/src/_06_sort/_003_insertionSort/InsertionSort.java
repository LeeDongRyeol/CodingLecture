package _06_sort._003_insertionSort;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		InsertionSort T = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
		
		for(int i : T.solution(n, arr)) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] solution(int n, int[] arr) {
		
		for (int i = 1; i < n; i++) {
			int tmp = arr[i];
			int aux = i - 1;
			while(aux >= 0 && arr[aux] > tmp) {
				arr[aux + 1] = arr[aux];
				aux--;
			}
			arr[aux + 1] = tmp;
		}
		
		return arr;
	}
}
