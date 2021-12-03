package _09_greedy._002_meetingRoom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _002_MeetingRoom {
	static class Meeting implements Comparable<Meeting> {
		int s, e;
		
		public Meeting(int s, int e) {
			this.s = s;
			this.e = e;
		}
		
		@Override
		public int compareTo(Meeting o) {
			if(this.e == o.e) return this.s - o.s;
			else return this.e - o.e;
		}
	}
	
	public static int solution(List<Meeting> list, int n) {
		int cnt = 0;
		Collections.sort(list);
		int endTime = 0;
		
		for(Meeting m : list) {
			if(m.s >= endTime) {
				cnt++;
				endTime = m.e;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Meeting> list = new ArrayList<Meeting>();
		for (int i = 0; i < n; i++) {
			list.add(new Meeting(sc.nextInt(), sc.nextInt()));
		}
		System.out.println(solution(list, n));
	}
}
