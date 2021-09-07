package _03_twoPointer._005_seriesNaturalSum;

import java.util.Scanner;

public class SeriesNaturalSum {
	public static void main(String[] args) {
		SeriesNaturalSum T = new SeriesNaturalSum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
	
	public static int solution(int n) {
		int answer = 0, cnt = 1;
		n--;
		while(n > 0) {
			cnt++;
			n = n-cnt;
			if(n % cnt == 0) answer++;
		}
		
		return answer;
	}
}
