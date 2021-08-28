package _002_convertEng;

import java.util.Scanner;

/**
 * 
 * @author dr854
 *
 *	2강 . 대소문자 변환
 *
 *	아스키코드
 *	대문자 : 65 ~ 90
 *	소문자 : 97 ~ 122
 *
 */

public class _002_ConvertEng {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		_002_ConvertEng m = new _002_ConvertEng();
		String str = sc.nextLine();
		System.out.println(_002_ConvertEng.solution(str));
	}
	
	public static String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//			else answer += Character.toLowerCase(x);
			
			if(x >= 97 && x <= 122) answer += (char)(x-32);
			else answer += (char)(x+32);
			
		}
		
		return answer;
	}
}
