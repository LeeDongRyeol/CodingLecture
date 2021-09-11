package _05_dataStructure._005_ironPoll;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println(T.solution(sc.next()));
	}
	
	public static int solution(String str) {
		int answer = 0;
		
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1) == '(') answer += stack.size();
				else answer += 1;
			}
		}
		
		
		return answer;
	}
}
