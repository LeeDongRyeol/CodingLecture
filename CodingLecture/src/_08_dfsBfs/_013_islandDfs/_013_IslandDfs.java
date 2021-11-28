package _08_dfsBfs._013_islandDfs;

import java.util.Scanner;

public class _013_IslandDfs {
	static int n, cnt;
	static int[] dy = {0, -1, -1, -1 , 0, 1, 1, 1};
	static int[] dx = {1, 1, 0, -1 ,-1 , -1, 0, 1};
	static int[][] map;
	static boolean[][] visit;
	
	public static void main(String[] args) {
		init();
		exec();
		System.out.println(cnt);
	}
	
	public static void exec() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(map[i][j] == 1 && !visit[i][j]) {
					dfs(i, j);
					cnt++;
				}
			}
		}
	}
	
	public static void init() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		visit = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
	}
	
	public static boolean checkRange(int y, int x) {
		return y < 0 || y >= n || x < 0 || x >= n;
	}
	
	public static void dfs(int y, int x) {
		visit[y][x] = true;
		
		for (int i = 0; i < 8; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			
			if(checkRange(ny, nx) || visit[ny][nx] || map[ny][nx] == 0) continue;
			
			dfs(ny, nx);
		}
	}
}
