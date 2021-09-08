package _05_dataStructure._001_correctBracket;

import java.util.Scanner;
import java.util.Stack;

public class _001_CorrectBracket {
	public static void main(String[] args) {
		_001_CorrectBracket T = new _001_CorrectBracket();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
	
	public static String solution(String str) {
		String answer = "NO";
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if(stack.isEmpty() || str.charAt(i) == '(') stack.push(str.charAt(i));
			else if(stack.peek() != str.charAt(i)) stack.pop();
		}
		
		if(stack.isEmpty()) answer = "YES";
		
		return answer;
	}
}
