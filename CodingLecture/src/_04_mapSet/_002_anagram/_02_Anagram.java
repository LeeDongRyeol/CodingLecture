package _04_mapSet._002_anagram;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _02_Anagram {
	public static void main(String[] args) {
		_02_Anagram T = new _02_Anagram();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine(), s2 = sc.nextLine();
		System.out.println(T.solution(s1, s2));
	}
	
	public static String solution(String s1, String s2) {
		String answer = "YES";
		
		Map<Character, Integer> map1 = new TreeMap<Character, Integer>();
		Map<Character, Integer> map2 = new TreeMap<Character, Integer>();
		
		for(char ch : s1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch : s2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}
		
		if(!map1.toString().equals(map2.toString())) answer = "NO";
		
		return answer;
	}
}
