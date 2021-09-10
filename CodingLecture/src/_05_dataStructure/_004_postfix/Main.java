package _05_dataStructure._004_postfix;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author dyl1912
 *
 * 백준 : 1806번 부분합
 * https://www.acmicpc.net/problem/1806
 */


public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}
	
	public static int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) stack.push(x - 48);
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				
				if(x == '+') stack.push(lt + rt);
				else if(x == '-') stack.push(lt - rt);
				else if(x == '*') stack.push(lt * rt);
				else if(x == '/') stack.push(lt / rt);
				
			}
		}
		
		answer = stack.get(0);
		
		return answer;
	}
}
