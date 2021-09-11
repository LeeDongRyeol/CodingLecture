package _05_dataStructure._006_rescuePrincess;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(n, k));
	}
	
	public static int solution(int n, int k) {
		int answer = 0;
		
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) q.offer(i);
		while(!q.isEmpty()) {
			for (int i = 1; i < k; i++) q.offer(q.poll());
			q.poll();
			if(q.size() == 1) answer = q.poll();
		}
		
		return answer;
	}
}
