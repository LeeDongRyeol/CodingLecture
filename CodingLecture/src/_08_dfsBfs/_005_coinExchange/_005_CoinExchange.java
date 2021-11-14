package _08_dfsBfs._005_coinExchange;

/**
 * 5. 동전교환
설명

다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?

각 단위의 동전은 무한정 쓸 수 있다.


입력
첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,

그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.


출력
첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.


예시 입력 1 

3
1 2 5
15

예시 출력 1

3

힌트

출력 설명 : 5 5 5 동전 3개로 거슬러 줄 수 있다. 

체크해줘야하는 사항
1) sum 값이 거슬러보다 많을 때
2) cnt 값이 answer보다 많을 때
 */

import java.util.Scanner;

public class _005_CoinExchange {
	static int n, m, answer = Integer.MAX_VALUE;
	static int[] coins;
	
	public static void dfs(int idx, int cnt, int sum) {
		if(sum > m) return;
		if(cnt >= answer) return;
		if(sum == m) {
			answer = Math.min(cnt, answer);
		} else {
			for (int i = idx; i < n; i++) {
				dfs(i, cnt + 1, sum + coins[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		coins = new int[n];
		
		for (int i = 0; i < n; i++) {
			coins[i] = sc.nextInt();
		}
		
		m = sc.nextInt();
		
		dfs(0, 0, 0);
		System.out.println(answer);
		sc.close();
	}
}
