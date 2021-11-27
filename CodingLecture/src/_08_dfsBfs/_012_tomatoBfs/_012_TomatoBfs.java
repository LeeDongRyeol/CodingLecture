package _08_dfsBfs._012_tomatoBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _012_TomatoBfs {
	static int[][] map;
	static boolean[][] visit;
	static int[] dy = {1, 0, -1, 0};
	static int[] dx = {0, 1, 0, -1};
	static int N, M;
	static Queue<Node> q = new LinkedList<Node>();
	static class Node {
		int y, x, step;
		public Node(int y, int x, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		M = stoi(st.nextToken()); N = stoi(st.nextToken());
		map = new int[N][M]; visit = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				map[i][j] = stoi(st.nextToken());
				if(map[i][j] == 1) {
					q.add(new Node(i, j, 0));
				}
			}
		}
		
		int day = bfs();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(day);
	}
	
	public static int bfs() {
		int day = 0;
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			visit[cur.y][cur.x] = true;
			
			for (int dir = 0; dir < 4; dir++) {
				int ny = cur.y + dy[dir];
				int nx = cur.x + dx[dir];
				
				if(ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
				if(map[ny][nx] == -1 || map[ny][nx] == 1 || visit[ny][nx]) continue;
				
				visit[ny][nx] = true;
				
				int step = cur.step + 1; 
				map[ny][nx] = 1;
				q.add(new Node(ny, nx, step));
			}
			
			day = cur.step;
		}
		
		return day;
	}
	
	public static int stoi(String str) {
		return Integer.parseInt(str);
	}
}
