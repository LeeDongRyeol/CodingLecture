package _09_greedy._001_wrestlingAthletic;

/**

5
172 67
183 65
180 70
170 72
181 60

3

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
	public int h, w;
	Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	
	@Override
	public int compareTo(Body o) {
		return o.h - this.h;
	}
}

public class Main {
	public int solution(ArrayList<Body> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for(Body ob : arr) {
			if(ob.w > max) {
				max = ob.w;
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Body> arr = new ArrayList<Body>();
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			arr.add(new Body(h, w));
		}
		System.out.println(T.solution(arr, n));
	}
}
