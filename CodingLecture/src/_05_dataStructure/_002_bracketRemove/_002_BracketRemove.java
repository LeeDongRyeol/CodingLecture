package _05_dataStructure._002_bracketRemove;

import java.util.Scanner;
import java.util.Stack;

public class _002_BracketRemove {
	public static void main(String[] args) {
		_002_BracketRemove T = new _002_BracketRemove();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
	
	public static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch : str.toCharArray()) {
			if(ch == '(') stack.push(ch);
			else if(!stack.isEmpty() && ch == ')') stack.pop();
			
			if(stack.isEmpty() && ch != '(' && ch != ')') answer += ch;
		}
		
		return answer;
	}
}