package _01_string._003_wordInSentence;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println(m.solution(sc.nextLine()));
	}
	
	public static String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
//		String[] s = str.split(" ");
//		for (String x : s) {
//			int len = x.length();
//			if(len > m) {
//				m = len;
//				answer = x;
//			}
//		}
		
		while((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			
			str = str.substring(pos+1);
		}
		
		// 마지막 단어는 체크해주지 못하기 때문에 마지막에 이렇게 해줘야한다.
		if(str.length() > m) answer = str;
		
		return answer;
	}
}
