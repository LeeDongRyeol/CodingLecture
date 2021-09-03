package _02_array._010_peek;

import java.util.Scanner;

public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(m.solution(n, arr));
	}
	
	public static int solution(int n, int[][] arr) {
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean flag = true;
				
				for (int k = 0; k < 4; k++) {
					int ny = i + dy[k];
					int nx = j + dx[k];
					
					if(ny >= 0 && ny < n && nx >= 0 && nx < n && arr[ny][nx] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				
				if(flag) answer++;
			}
		}
		
		return answer;
	}
}
