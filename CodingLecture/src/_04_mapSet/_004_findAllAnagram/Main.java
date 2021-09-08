package _04_mapSet._004_findAllAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(T.solution(s1, s2));
	}
	
	public static int solution(String s1, String s2) {
		int answer = 0;
		
		Map<Character, Integer> aMap = new HashMap<>();
		Map<Character, Integer> bMap = new HashMap<>();
		
		for(char ch : s2.toCharArray()) bMap.put(ch, bMap.getOrDefault(ch, 0) + 1);
		int L = s2.length() - 1;
		
		for (int i = 0; i < L; i++) aMap.put(s1.charAt(i), aMap.getOrDefault(s1.charAt(i), 0) + 1);
		int lt = 0;
		for (int rt = 0; rt < s1.length(); rt++) {
			aMap.put(s1.charAt(rt), aMap.getOrDefault(s1.charAt(rt), 0) + 1);
			if(aMap.equals(bMap)) answer++;
			aMap.put(s1.charAt(lt), aMap.get(s1.charAt(lt)) - 1);
			if(aMap.get(s1.charAt(lt)) == 0) aMap.remove(s1.charAt(lt));
			lt++;
		}
		
		return answer;
	}
}
