package _04_mapSet._004_findAllAnagram;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 
 * @author dyl1912
 *
 *4. 모든 아나그램 찾기
설명

S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.

아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.


입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.

S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.


출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.


예시 입력 1 

bacaAacba
abc
예시 출력 1

3
힌트

출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 */

public class _004_FindAllAnagram {
	public static void main(String[] args) {
		_004_FindAllAnagram T = new _004_FindAllAnagram();
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(T.solution(s1, s2));
	}
	
	public static int solution(String s1, String s2) {
		int answer = 0;
		
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for(char ch : s2.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		Map<Character, Integer> comp = new TreeMap<Character, Integer>();
		int lt = 0;
		
		for (int rt = 0; rt < s1.length(); rt++) {
			char ch = s1.charAt(rt);
			comp.put(ch, comp.getOrDefault(ch, 0) + 1);
			
			if(rt >= s2.length() -1) {
				if(map.equals(comp)) answer++;
				char front = s1.charAt(lt);
				comp.put(front, comp.get(front) -1);
				if(comp.get(front) == 0) comp.remove(front);
				lt++;
			}
		}
		
		return answer;
	}
}
