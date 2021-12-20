package _10_dp._006_getMaxScore;

import java.util.Scanner;

/**
 * 
 * @author dr854

5 20
10 5
25 12
15 8
6 3
7 4

41
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] dy = new int[m+1];
		for (int i = 0; i < n; i++) {
			int ps = sc.nextInt();
			int pt = sc.nextInt();
			for (int j = m; j >= pt; j--) {
				dy[j] = Math.max(dy[j], dy[j - pt] + ps);
			}
		}
		
		System.out.println(dy[m]);
	}
}
