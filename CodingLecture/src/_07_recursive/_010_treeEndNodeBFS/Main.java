package _07_recursive._010_treeEndNodeBFS;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int root;
	Node lt, rt;
	public Node(int val) {
		root = val;
		lt = rt = null;
	}
}

public class Main {
	static Node root;
	
	public static void main(String[] args) {
		Main tree = new Main();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.bfs(tree.root));
		
	}
	
	public static int bfs(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				Node cur = q.poll();
				if(cur.lt == null && cur.rt == null) return L;
				if(cur.lt != null) q.add(cur.lt);
				if(cur.rt != null) q.add(cur.rt);
			}
			
			L++;
		}
		
		return 0;
	}
}

