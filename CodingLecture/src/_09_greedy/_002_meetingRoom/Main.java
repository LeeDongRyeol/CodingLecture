package _09_greedy._002_meetingRoom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// 끝나는 시간 기준으로 오름차순, 끝나는 시간이 같으면 오름차순 정렬

class Time implements Comparable<Time> {
	int s, e;
	
	public Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
}

public class Main {
	public static int solution(ArrayList<Time> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int et = 0;
		for(Time ob : arr) {
			if(ob.s >= et) {
				cnt++;
				et = ob.e;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<Time>();
		for (int i = 0; i < n; i++) {
			arr.add(new Time(sc.nextInt(), sc.nextInt()));
		}
		System.out.println(solution(arr, n));
		
	}
}
