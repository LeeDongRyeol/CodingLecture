package _03_twoPointer._002_getCommonElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
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
		Arrays.sort(arr1); Arrays.sort(arr2);
		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m) {
			if(arr1[p1] == arr2[p2]) {
				list.add(arr1[p1++]);
				p2++;
			} else if(arr1[p1] < arr2[p2]) p1++;
			else p2++;
		}
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
