package _01_string._009_extractOnlyNumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println(m.solution(sc.nextLine()));
	}
	
	public static int solution(String s) {
		String answer = "";
		
		for(char x : s.toCharArray()) {
//			if(x >= 48 && x <= 57) answer = answer * 10 + (x-48); // 아스키코드 숫자에 해당하는 범위로
			if(Character.isDigit(x)) answer += x;
		}
		
		return Integer.parseInt(answer);
	}
}
