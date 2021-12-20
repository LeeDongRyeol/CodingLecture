package _10_dp._004_theHighestTop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @author dr854

5
25 3 4
4 4 6
9 2 3
16 2 5
1 5 2

10
 */

public class Main {
	static int[] dy;
	
	static class Brick implements Comparable<Brick> {
		public int s, h, w;
		
		Brick(int s, int h, int w) {
			this.s = s;
			this.h = h;
			this.w = w;
		}
		
		@Override
		public int compareTo(Brick o) {
			return o.s - this.s;
		}
	}
	
	public static int solution(ArrayList<Brick> arr) {
		int answer = 0;
		Collections.sort(arr);
		dy[0] = arr.get(0).h;
		answer = dy[0];
		for (int i = 1; i < arr.size(); i++) {
			int max_h = 0;
			for (int j = i-1; j >= 0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
					max_h = dy[j];
				}
			}
			
			dy[i] = max_h + arr.get(i).h;
			answer = Math.max(answer, dy[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Brick> arr = new ArrayList<Brick>();
		dy = new int[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr.add(new Brick(a, b, c));
		}
		System.out.println(solution(arr));
	}
}
