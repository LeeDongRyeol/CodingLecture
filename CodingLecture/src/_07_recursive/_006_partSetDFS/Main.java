package _07_recursive._006_partSetDFS;

import java.util.Scanner;

public class Main {
	static int n;
	static int[] ch;
	public static void dfs(int l) {
		if(l == n+1) {
			String tmp = "";
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 1) tmp += (i + " ");
			}
			if(tmp.length() > 0) System.out.println(tmp);
		} else {
			ch[l] = 1;
			dfs(l+1);
			ch[l] = 0;
			dfs(l+1);
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		n = 3;
		ch = new int[n+1];
		T.dfs(1);
	}
}
