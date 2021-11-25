package _08_dfsBfs._009_getCombi;

/**
 *  
입력 
4 2

출력
1 2 
1 3 
1 4 
2 3 
2 4 
3 4 
 */

import java.util.Scanner;

public class Main {
	static int[] combi;
	static int n, m;
	
	public static void dfs(int L, int s) {
		if(L == m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		} else {
			for (int i = s; i <= n; i++) {
				combi[L] = i;
				dfs(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		combi = new int[m];
		dfs(0, 1);
	}
}
