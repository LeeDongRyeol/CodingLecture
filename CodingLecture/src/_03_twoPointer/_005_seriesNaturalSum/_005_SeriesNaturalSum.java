package _03_twoPointer._005_seriesNaturalSum;

import java.util.Scanner;

public class _005_SeriesNaturalSum {
	public static void main(String[] args) {
		_005_SeriesNaturalSum T = new _005_SeriesNaturalSum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
	
	public static int solution(int n) {
		int answer = 0, sum = 0, lt = 1;
		
		for (int rt = 1; rt <= n; rt++) {
			if(rt == n) break;
			sum += rt;
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= lt++;
				if(sum == n) answer++;
			}
		}
		
		return answer;
	}
}
