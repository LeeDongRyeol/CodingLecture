package _09_greedy._008_wonderland_PQ;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
	int v1, cost;
	
	Edge(int v1, int cost) {
		this.v1 = v1;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), answer = 0;
		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		
		int[] ch = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph.get(a).add(new Edge(b, c));
			graph.get(b).add(new Edge(a, c));
		}
		PriorityQueue<Edge> pQ = new PriorityQueue<Edge>();
		pQ.offer(new Edge(1, 0));
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int ev = tmp.v1;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;
				for(Edge ob : graph.get(ev)) {
					if(ch[ob.v1] == 0) pQ.offer(new Edge(ob.v1, ob.cost));
				}
			}
		}
		
		System.out.println(answer);
	}
}
