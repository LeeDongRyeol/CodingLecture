package _06_sort._007_coordinate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static class Point implements Comparable<Point> {
		int y;
		int x;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			// 오름차순
			if(this.x == o.x) return this.y - o.y;
			else return this.x - o.x;
			
			// 내림차순
//			if(this.x == o.x) return o.y - this.y;
//			else return o.x - this.x;
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<Main.Point>();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x,y));
		}
		
		Collections.sort(arr);
		
		for(Point p : arr) {
			System.out.println(p.x + " " + p.y);
		}
	}
}
