package _09_greedy._003_wedding;

/**

5
14 18
12 15
15 20
20 30
5 14

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Time implements Comparable<Time> {
		int time;
		char state;
		
		Time(int time, char state) {
			this.time = time;
			this.state = state;
		}

		@Override
		public int compareTo(Time o) {
			if(this.time == o.time) return this.state - o.state;
			else return this.time - o.time;
		}
	}
	public static int solution(List<Time> list) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(list);
		int cnt = 0;
		
		for(Time ob : list) {
			if(ob.state == 's') cnt++;
			else cnt--;
			
			answer = Math.max(answer, cnt);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Time> list = new ArrayList<Time>();
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int sT = sc.nextInt();
			int eT = sc.nextInt();
			list.add(new Time(sT, 's'));
			list.add(new Time(eT, 'e'));
		}
		
		System.out.println(solution(list));
	}
}