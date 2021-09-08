package _05_dataStructure._001_correctBracket;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author dr854
 *1. 올바른 괄호
설명

괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.

(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.


입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.


출력
첫 번째 줄에 YES, NO를 출력한다.


예시 입력 1 

(()(()))(()
예시 출력 1

NO
 */

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
