package _01_string._012_password;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(m.solution(sc.next(), n));
	}
	
	public static String solution(String s, int n) {
		String answer = "";
		
		for (int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			s = s.substring(7);
		}
		
		return answer;
	}
}
