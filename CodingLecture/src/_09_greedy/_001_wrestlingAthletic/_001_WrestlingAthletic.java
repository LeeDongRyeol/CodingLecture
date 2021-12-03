package _09_greedy._001_wrestlingAthletic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _001_WrestlingAthletic {
	
	static class Body implements Comparable<Body> {
		int h, w;
		
		public Body(int h, int w) {
			this.h = h;
			this.w = w;
		}

		@Override
		public int compareTo(Body o) {
			return o.h - this.h;
		}
	}
	
	public static int solution(List<Body> arr) {
		int cnt = 0;
		int max = Integer.MIN_VALUE;
		Collections.sort(arr);
		
		for(Body body : arr) {
			if(body.w > max) {
				max = body.w;
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Body> list = new ArrayList<Body>();
		for (int i = 0; i < n; i++) {
			list.add(new Body(sc.nextInt(), sc.nextInt()));
		}
		System.out.println(solution(list));
	}
}
