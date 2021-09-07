package _04_mapSet._001_classChief;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ClassCheif {
	public static void main(String[] args) {
		ClassCheif T = new ClassCheif();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}
	
	public static char solution(int n, String str) {
		char answer = ' ';
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			map.put(temp, map.getOrDefault(temp, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		Iterator<Character> ir = map.keySet().iterator();
		while(ir.hasNext()) {
			char key = ir.next();
			int val = map.get(key);
			if(max < val) {
				max = val;
				answer = key;
			}
		}
		
		return answer;
	}
}
