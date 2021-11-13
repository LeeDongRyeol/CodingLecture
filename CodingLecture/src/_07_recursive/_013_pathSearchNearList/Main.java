package _07_recursive._013_pathSearchNearList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 인접리스트를 쓰는 경우? 정점의 갯수가 너무 많을 때 인접 행렬은 비효율적이다.
 인접행렬을 하는 경우, 정점의 갯수가 10000개일때, 10000 * 10000을 해야한다.
 
 메모리 낭비가 너무 심하다.
 
 그래서 정점의 갯수가 무수히 많은 경우, 인접리스트를 써야한다.
 
인접리스트(경로탐색 DFS) 백트래킹
 
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
 
 * 
 */

public class Main {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public static void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
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
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}

