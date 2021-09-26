package _07_recursive._002_binaryPrint;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		T.dfs(11);
	}
	
	public static void dfs(int n) {
		if(n == 0) return;
		else {
			dfs(n/2);
			System.out.print(n%2 + " ");
		}
	}
}
