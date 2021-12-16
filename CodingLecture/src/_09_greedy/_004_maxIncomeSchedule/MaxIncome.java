package _09_greedy._004_maxIncomeSchedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 * @author dr854
6
50 2
20 1
40 2
60 3
30 3
30 1
 */

public class MaxIncome {
	
	static class Lecture implements Comparable<Lecture> {
		int money, time;
		
		Lecture(int money, int time) {
			this.money = money;
			this.time = time;
		}
		
		@Override
		public int compareTo(Lecture o) {
			return o.time - this.time;
		}
	}
	
	static int n, max = Integer.MIN_VALUE;
	
	public static int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		Collections.sort(arr);
		int j = 0;
		for (int i = max; i >= 1; i--) {
			for(; j < n; j++) {
				if(arr.get(j).time < i) break;
				pq.offer(arr.get(j).money);
			}
			
			if(!pq.isEmpty()) answer += pq.poll();
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Lecture> arr = new ArrayList<Lecture>();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			arr.add(new Lecture(m, d));
			if(d > max) max = d;
		}
		
		System.out.println(solution(arr));
	}
	
}
