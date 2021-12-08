package _09_greedy._007_wonderland;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _007_Wonderland {
	static class Edge implements Comparable<Edge> {
		int v1, v2, cost;
		
		Edge(int v1, int v2, int cost) {
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}
	
	static int[] unf;
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int v1, int v2) {
		int fv1 = Find(v1);
		int fv2 = Find(v2);
		if(fv1 != fv2) unf[fv1] = fv2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), answer = 0;
		unf = new int[n+1];
		ArrayList<Edge> arr = new ArrayList<Edge>();
		for (int i = 1; i <= n; i++) unf[i] = i;
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt(), v2 = sc.nextInt(), cost = sc.nextInt();
			arr.add(new Edge(v1, v2, cost));
		}
		
		Collections.sort(arr);
		for(Edge e : arr) {
			int fv1 = Find(e.v1);
			int fv2 = Find(e.v2);
			
			if(fv1 != fv2) {
				Union(e.v1, e.v2);
				answer += e.cost;
			}
		}
		
		System.out.println(answer);
	}
}
