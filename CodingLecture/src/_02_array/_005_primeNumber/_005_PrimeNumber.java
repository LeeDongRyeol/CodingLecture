package _02_array._005_primeNumber;

import java.util.Scanner;

public class _005_PrimeNumber {
	public static void main(String[] args) {
		_005_PrimeNumber  m = new _005_PrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println(m.solution(sc.nextInt()));
	}
	
	public static int solution(int num) {
		int answer = 0;
		int[] arr = new int[num + 1];
		
		for (int i = 2; i <= num; i++) {
			if(arr[i] == 0) {
				answer++;
				for (int j = i; j <= num; j+=i) arr[j] = 1;
			}
		}
		
		return answer;
	}
}
