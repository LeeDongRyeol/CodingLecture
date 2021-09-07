package _04_mapSet._001_classChief;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}
	
	public static char solution(int n, String str) {
		char answer = ' ';
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			if(max < map.get(key)) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
}
