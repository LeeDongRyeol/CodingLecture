package _004_reverseWord;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] str = new String[N];
		
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		
		for(String x : m.solution(N, str)) {
			System.out.println(x);
		}
	}
	
	public static ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}
}
