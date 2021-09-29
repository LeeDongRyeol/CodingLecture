package _07_recursive._009_treeEndNodeDFS;

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
		System.out.println(tree.dfs(0, tree.root));
		
	}
	
	public static int dfs(int L, Node root) {
		if(root.lt == null && root.rt == null) return L;
		else return Math.min(dfs(L+1, root.lt), dfs(L+1, root.rt));
	}
}

