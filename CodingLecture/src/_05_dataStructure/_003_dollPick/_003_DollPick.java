package _05_dataStructure._003_dollPick;

import java.util.Scanner;
import java.util.Stack;

public class _003_DollPick {
	public static void main(String[] args) {
		_003_DollPick T = new _003_DollPick();
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
		
		System.out.println(T.solution(n, arr1, m, arr2));
	}
	
	public static int solution(int n, int[][] board, int m,  int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int[] idx = new int[n];
		
		for (int i = 0; i < m; i++) {
			int k = moves[i] - 1;
			while(board[idx[k]][k] == 0) {
				if(idx[k] == n - 1) break;
				idx[k]++;
			}
			
			if(stack.isEmpty() || stack.peek() != board[idx[k]][k]) stack.push(board[idx[k]][k]);
			else {
				stack.pop();
				answer += 2;
			}
			
			board[idx[k]][k] = 0;
		}
		
		return answer;
	}
}