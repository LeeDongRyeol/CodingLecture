package _08_dfsBfs._014_islandBfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _014_IslandBfs {
	static int n, cnt;
	static int[] dy = {0, -1, -1, -1 , 0, 1, 1, 1};
	static int[] dx = {1, 1, 0, -1 ,-1 , -1, 0, 1};
	static int[][] map;
	static boolean[][] visit;
	
	static class Pos {
		int y, x;
		Pos(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) {
		init();
		exec();
		System.out.println(cnt);
	}
	
	public static void exec() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(map[i][j] == 1 && !visit[i][j]) {
					bfs(i, j);
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
	
	public static void bfs(int y, int x) {
		Queue<Pos> q =  new LinkedList<Pos>();
		visit[y][x] = true;
		q.add(new Pos(y, x));
		
		while(!q.isEmpty()) {
			Pos cur = q.poll();
			
			for (int i = 0; i < 8; i++) {
				int ny = cur.y + dy[i];
				int nx = cur.x + dx[i];
				
				if(checkRange(ny, nx) || visit[ny][nx] || map[ny][nx] == 0) continue;
				visit[ny][nx] = true;
				q.add(new Pos(ny, nx));
			}
		}
	}
}
