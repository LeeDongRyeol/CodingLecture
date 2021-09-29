package _07_recursive._008_findCalf;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * @author dr854
 * 8. 송아지 찾기 1(BFS : 상태트리탐색)
설명

현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.

현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.

송아지는 움직이지 않고 제자리에 있다.

현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.

최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.


입력
첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.


출력
점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.


예시 입력 1 

5 14

예시 출력 1

3
 */

public class _008_FindCalf {
	static class Spot {
		int data;
		int cnt;
		
		public Spot(int data, int cnt) {
			this.data = data;
			this.cnt = cnt;
		}
	}
	static int[] spot = new int[10001];
	static boolean[] check = new boolean[10001];
	static int[] dx = {1, -1, 5};
	
	public static void main(String[] args) {
		_008_FindCalf T = new _008_FindCalf();
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(), E = sc.nextInt();
		System.out.println(T.solution(S, E));
	}
	
	public static int solution(int S, int E) {
		int answer = 0;
		Queue<Spot> q = new LinkedList<>();
		q.add(new Spot(S, 0));
		while(!q.isEmpty()) {
			Spot now = q.poll();
			
			if(now.data == E) {
				answer = now.cnt;
				break;
			}
			
			if(check[now.data] || spot[now.data] != 0) continue;
			check[now.data] = true;
			spot[now.data] = now.data;
			
			for (int jump = 0; jump < 3; jump++) {
				int nx = now.data + dx[jump];
				
				if(nx < 1 || nx > 10000) continue;
				if(check[nx]) continue;
				
				q.add(new Spot(nx, now.cnt +1));
			}
		}
		
		return answer;
	}
}

