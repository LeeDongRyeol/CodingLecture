package _01_string._011_stringPress;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println(m.solution(sc.nextLine()));
	}
	
	public static String solution(String s) {
		String answer = "";
		
		s = s + " "; // 끝 문자까지 모두 돌기 위해서
		int cnt = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) cnt++;
			else {
				answer += s.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		
		return answer;
	}
}
