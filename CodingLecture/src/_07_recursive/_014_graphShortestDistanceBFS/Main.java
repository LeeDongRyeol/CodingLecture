package _07_recursive._014_graphShortestDistanceBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 *
 
인접리스트(경로탐색 DFS) 백트래킹
 
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 
 * 
 */

public class Main {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;	// ch : 방문여부 체크 배열, dis : 1 정점으로부터 이동한 거리 배열
	
	public static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv = queue.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					queue.offer(nv);
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
		
	}
}

