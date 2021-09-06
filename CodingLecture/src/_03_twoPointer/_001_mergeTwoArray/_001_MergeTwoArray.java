package _03_twoPointer._001_mergeTwoArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _001_MergeTwoArray {
	public static void main(String[] args) {
		_001_MergeTwoArray main = new _001_MergeTwoArray();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int x : main.solution(n, arr1, m, arr2)) {
			System.out.print(x + " ");
		}
	}
	
	public static int[] solution(int n, int[] arr1, int m, int[] arr2) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(arr1[i]);
		}
		
		for (int i = 0; i < m; i++) {
			list.add(arr2[i]);
		}
		
		Collections.sort(list);
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
