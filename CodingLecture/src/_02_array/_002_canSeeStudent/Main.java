package _02_array._002_canSeeStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println(m.solution(n, list));
	}
	
	public static int solution(int n, ArrayList<Integer> list) {
		int answer = 1;
		int max = list.get(0);
		
		for (int i = 1; i < n; i++) {
			if(list.get(i) > max) {
				answer++;
				max = list.get(i);
			}
		}
		
		return answer;
	}
}
