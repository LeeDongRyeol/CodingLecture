package _05_dataStructure._003_dollPick;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr1 = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(arr1, arr2));
	}
	
	public static int solution(int[][] board,  int[] moves) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if(board[i][pos-1] != 0) {
					int tmp = board[i][pos -1];
					board[i][pos-1] = 0;
					if(!stack.isEmpty() && tmp == stack.peek()) {
						answer += 2;
						stack.pop();
					} else stack.push(tmp);
					break;
				}
			}
		}
		
		return answer;
	}
}