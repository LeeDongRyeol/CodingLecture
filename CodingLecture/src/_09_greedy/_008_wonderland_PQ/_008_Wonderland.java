package _09_greedy._008_wonderland_PQ;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _008_Wonderland {
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), answer = 0;
		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
		
		for (int i = 0; i <= n; i++) graph.add(new ArrayList<Edge>());
		
		boolean[] check = new boolean[n+1];
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		
		for (int i = 0; i < m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();
			graph.get(from).add(new Edge(to, cost));
			graph.get(to).add(new Edge(from, cost));
		}
		
		pq.offer(new Edge(1, 0));
		while(!pq.isEmpty()) {
			Edge e = pq.poll();
			if(!check[e.vex]) {
				check[e.vex] = true;
				answer += e.cost;
				for(Edge tmp : graph.get(e.vex)) {
					if(!check[tmp.vex]) {
						pq.add(new Edge(tmp.vex, tmp.cost));
					}
				}
			}
		}
		
		System.out.println(answer);
	}
}
