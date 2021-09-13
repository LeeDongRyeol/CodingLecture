package _05_dataStructure._004_postfix;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
	public static void main(String[] args) {
		Postfix T = new Postfix();
		Scanner sc = new Scanner(System.in);
		System.out.println(T.solution(sc.next()));
	}
	
	public static int solution(String str) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) stack.push(ch -48);
			else {
				int n = stack.pop();
				int m = stack.pop();
				
				if(ch == '+') stack.push(n+m);
				else if(ch == '-') stack.push(m-n);
				else if(ch == '*') stack.push(m*n);
				else if(ch == '/') stack.push(m/n);
			}
		}
		
		answer = stack.pop();
		
		return answer;
	}
}
