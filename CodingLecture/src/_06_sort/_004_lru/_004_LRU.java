package _06_sort._004_lru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _004_LRU {
	public static void main(String[] args) {
		_004_LRU T = new _004_LRU();
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
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int num = arr[i];
			
			if(list.contains(num)) list.remove(list.indexOf(num));
			list.add(num);
			if(list.size() > s) list.remove(0);
		}
		
		Collections.reverse(list);
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
