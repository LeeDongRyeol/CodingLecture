package _06_sort._004_lru;

import java.util.Scanner;

public class LRU {
	public static void main(String[] args) {
		LRU T = new LRU();
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt(), n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : T.solution(s, n, arr)) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] solution(int s, int n, int[] arr) {
		int[] cache = new int[s];
		
		for(int num : arr) {
			int pos = -1;
			for (int i = 0; i < s; i++) {
				if(cache[i] == num) pos = i;
			}
			
			for (int i = pos == -1 ? s -1 : pos; i >= 1; i--) {
				cache[i] = cache[i-1];
			}
			
			cache[0] = num;
		}
		
		return cache;
	}
}
