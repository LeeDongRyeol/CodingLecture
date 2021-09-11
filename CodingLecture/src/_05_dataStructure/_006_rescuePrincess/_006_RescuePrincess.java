package _05_dataStructure._006_rescuePrincess;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _006_RescuePrincess {
	public static void main(String[] args) {
		_006_RescuePrincess T = new _006_RescuePrincess();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(n, k));
	}
	
	public static int solution(int n, int k) {
		int answer = 0;
		
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		int cnt = 1;
		while(q.size() > 1) {
			int num = q.poll();
			if(cnt < k) {
				q.add(num); cnt++;
			} else if(cnt == k) cnt = 1;
		}
		
		answer = q.poll();
		
		return answer;
	}
}
