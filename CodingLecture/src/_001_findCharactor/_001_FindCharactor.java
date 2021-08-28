package _001_findCharactor;

import java.util.Scanner;

public class _001_FindCharactor {
	public static void main(String[] args) {
		_001_FindCharactor m = new _001_FindCharactor();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toLowerCase();
		String ch = sc.next().toLowerCase();
		
		System.out.println(m.solution(str, ch.charAt(0)));
		
		
//		int cnt = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if(ch.equals(str.substring(i, i+1))) cnt++;
//		}
//		
//		System.out.println(cnt);
	}
	
	public static int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == t) answer++;
//		}
		
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
		}
		
		
		return answer;
	}
}
