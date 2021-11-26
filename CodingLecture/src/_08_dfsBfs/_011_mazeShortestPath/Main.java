package _08_dfsBfs._011_mazeShortestPath;

/**
 *  11. 미로의 최단거리 통로(BFS)
설명

7*7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 작성하세요.

경로의 길이는 출발점에서 도착점까지 가는데 이동한 횟수를 의미한다.

출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 도로이다.

격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면

Image1.jpg

위와 같은 경로가 최단 경로의 길이는 12이다.


입력
첫 번째 줄부터 7*7 격자의 정보가 주어집니다.


출력
첫 번째 줄에 최단으로 움직인 칸의 수를 출력한다. 도착할 수 없으면 -1를 출력한다.


예시 입력 1 

0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0
예시 출력 1

12
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] dy = {1, 0, -1, 0};
	static int[] dx = {0, 1, 0, -1};
	static int[][] map = new int[7][7];
	static boolean[][] visit = new boolean[7][7];
	static int len = Integer.MAX_VALUE;
	
	static class Pos {
		int y, x, cnt;
		
		Pos(int y, int x, int cnt) {
			this.y = y;
			this.x = x;
			this.cnt = cnt;
		}
	}
	
	public static void bfs() {
		Queue<Pos> q = new LinkedList<Pos>();
		q.add(new Pos(0, 0, 0));
		
		while(!q.isEmpty()) {
			Pos cur = q.poll();
			
			if(cur.y == 6 && cur.x == 6) {
				len = Math.min(len, cur.cnt);
				continue;
			}
			
			for (int dir = 0; dir < 4; dir++) {
				int nx = cur.x + dx[dir];
				int ny = cur.y + dy[dir];
				
				if(checkRange(ny, nx) || visit[ny][nx] || map[ny][nx] == 1) continue;
				visit[ny][nx] = true;
				q.add(new Pos(ny, nx, cur.cnt + 1));
			}
		}
	}
	
	public static boolean checkRange(int y, int x) {
		return y < 0 || y >= 7 || x < 0 || x >= 7;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		bfs();
		
		int answer = len == Integer.MAX_VALUE ? -1 : len;
		System.out.println(answer);
	}
}
