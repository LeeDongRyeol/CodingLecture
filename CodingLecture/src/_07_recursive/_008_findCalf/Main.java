package _07_recursive._008_findCalf;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] dis = {1, -1, 5};
	static int[] ch;
	static Queue<Integer> Q = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(), E = sc.nextInt();
		System.out.println(T.bfs(S, E));
	}
	
	public static int bfs(int S, int E) {
		ch = new int[10001];
		ch[S] = 1;
		Q.offer(S);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				
				for (int j = 0; j < 3; j++) {
					int nx = x + dis[j];
					if(nx == E) return L+1;
					if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		
		return 0;
	}
}

