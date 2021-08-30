package _01_string._007_circleString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println(m.solution(sc.next()));
	}
	
	public static String solution(String str) {
//		int len = str.length();
//		for(int i = 0; i < len / 2; i++) {
//			if(str.charAt(i) != str.charAt(len - i- 1)) return "NO";
//		}
		
		String answer ="YES";
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		else answer = "NO";
		
		return answer; 
	}
}
