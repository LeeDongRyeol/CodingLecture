package _01_string._005_SpecialWordReverse;

import java.util.Scanner;

public class _005_SpecialWordReverse {
	public static void main(String[] args) {
		_005_SpecialWordReverse m = new _005_SpecialWordReverse();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(m.solution(str));
	}
	
	public static String solution(String str) {
		String answer = "";
		
		char[] s = str.toCharArray();
		int sf = 0, sl = str.length() - 1;
		while(sf < sl) {
			if(!Character.isAlphabetic(s[sf])) sf++;
			else if(!Character.isAlphabetic(s[sl])) sl--;
			else {
				char temp = s[sf];
				s[sf] = s[sl];
				s[sl] = temp;
				sf++;
				sl--;
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			answer += s[i];
		}
		
		return answer;
	}
}
