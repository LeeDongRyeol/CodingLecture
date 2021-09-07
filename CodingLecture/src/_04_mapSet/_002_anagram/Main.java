package _04_mapSet._002_anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine(), s2 = sc.nextLine();
		System.out.println(T.solution(s1, s2));
	}
	
	public static String solution(String s1, String s2) {
		String answer = "YES";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		for(char x : s2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) return "NO";
			map.put(x, map.get(x) -1);
		}
		
		return answer;
	}
}
