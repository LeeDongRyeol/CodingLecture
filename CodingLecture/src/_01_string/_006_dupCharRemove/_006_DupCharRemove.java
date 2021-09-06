package _01_string._006_dupCharRemove;

import java.util.Scanner;

public class _006_DupCharRemove {
	public static void main(String[] args) {
		_006_DupCharRemove m = new _006_DupCharRemove();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(m.solution(str));
	}
	
	public static String solution(String str) {
		String answer = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
		}
		
		return answer;
	}
}
