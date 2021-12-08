package _09_greedy._005_dijkstra;

/**
 * 
6 9
1 2 12
1 3 4
2 1 2
2 3 5
2 5 5
3 4 5
4 2 2
4 5 5
6 4 5
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;
	
	static class Edge implements Comparable<Edge> {
		int vex, cost;
		
		Edge(int vex, int cost) {
			this.vex = vex;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}
	
	public static void solution(int v) {
		PriorityQueue<Edge> pQ = new PriorityQueue<Edge>();
		pQ.offer(new Edge(v, 0));
		dis[v] = 0;
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost > dis[now]) continue;
			for(Edge ob : graph.get(now)) {
				if(dis[ob.vex] > nowCost + ob.cost) {
					dis[ob.vex] = nowCost + ob.cost;
					pQ.offer(new Edge(ob.vex, nowCost+ ob.cost));
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		graph = new ArrayList<ArrayList<Edge>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for (int i = 0; i < m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();
			graph.get(from).add(new Edge(to, cost));
		}
		
		solution(1);
		for (int i = 2; i <= n; i++) {
			if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
			else System.out.println(i + " : impossible");
		}
	}
}
