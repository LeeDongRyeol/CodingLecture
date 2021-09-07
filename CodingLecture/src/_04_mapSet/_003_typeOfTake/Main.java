package _04_mapSet._003_typeOfTake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
	
	public static int[] solution(int n, int k, int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int lt = 0;
		
		for (int rt = 0; rt < n; rt++) {
			if(k <= rt) {
				map.put(arr[lt], map.get(arr[lt]) - 1);
				if(map.get(arr[lt]) == 0) {
					map.remove(arr[lt++]);
				}
			}
			
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			
			if(k - 1 <= rt) {
				list.add(map.size());
			}
		}
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
