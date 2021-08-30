package _01_string._010_theShortestDist;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		for (int x : m.solution(sc.next(), sc.next().charAt(0))) {
			System.out.print(x + " ");
		}
	}
	
	public static int[] solution(String str, char ch) {
		int[] answer = new int[str.length()];
		
		int p = 1000;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		p = 1000;
		for (int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == ch) p = 0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
}
