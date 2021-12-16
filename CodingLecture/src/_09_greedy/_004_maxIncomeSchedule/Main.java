package _09_greedy._004_maxIncomeSchedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int n , max = Integer.MIN_VALUE;
	
	static class Lecture implements Comparable<Lecture> {
		int money, date;
		
		Lecture(int money, int date) {
			this.money = money;
			this.date = date;
		}
		
		@Override
		public int compareTo(Lecture o) {
			return o.date - this.date;
		}
	}
	
	public static int solution(List<Lecture> list) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		Collections.sort(list);
		int j = 0;
		for(int i = max; i >= 1; i--) {
			for( ; j < n; j++) {
				if(list.get(j).date < i) break;
				else pQ.add(list.get(j).money);
			}
			
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		List<Lecture> list = new ArrayList<Lecture>();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			list.add(new Lecture(m, d));
			if(d > max) max = d;
		}
		
		System.out.println(solution(list));
	}
}
