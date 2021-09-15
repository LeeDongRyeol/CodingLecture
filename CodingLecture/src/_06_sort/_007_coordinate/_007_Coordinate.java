package _06_sort._007_coordinate;

import java.util.Arrays;
import java.util.Scanner;

public class _007_Coordinate {
	static class Coordinate implements Comparable<Coordinate> {
		int y;
		int x;
		
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Coordinate o) {
			if(this.x > o.x) return 1;
			else if(this.x == o.x) {
				if(this.y > o.y) return 1;
				else if(this.y == o.y) return 0;
				else return -1;
			} else return -1;
		}
	}
	
	public static void main(String[] args) {
		_007_Coordinate T = new _007_Coordinate();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Coordinate[] arr = new Coordinate[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = new Coordinate(sc.nextInt(), sc.nextInt());
		}
		
		for(Coordinate c : T.solution(n, arr)) {
			System.out.println(c.x + " " + c.y);
		}
	}
	
	public static Coordinate[] solution(int n, Coordinate[] arr) {
		Arrays.sort(arr);
		
		return arr;
	}
}
