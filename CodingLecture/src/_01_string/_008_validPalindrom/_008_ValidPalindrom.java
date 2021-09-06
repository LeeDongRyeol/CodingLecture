package _01_string._008_validPalindrom;

import java.util.Scanner;

public class _008_ValidPalindrom {
	public static void main(String[] args) {
		_008_ValidPalindrom m = new _008_ValidPalindrom();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(m.solution(str));
	}
	
	public static String solution(String str) {
		String answer = "YES";
		str = str.replaceAll("[^A-Za-z]", "").toLowerCase();
		String reverse = new StringBuilder(str).reverse().toString();
		
		if(!str.equals(reverse)) answer = "NO";
		return answer;
	}
}
