package _02_array._006_reversePrimeNum;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int num : m.solution(n, arr)) {
			System.out.print(num + " ");
		}
	}
	
	public static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp % 10;
				res = res*10 + t;
				tmp /= 10;
			}
			
			if(isPrime(res)) {
				answer.add(res);
			}
		}
		
		return answer;
	}
	
	public static boolean isPrime(int n) {
		if(n == 1) return false;
		for (int i = 2; i < n; i++) {
			if(n % i == 0) return false;
		}
		
		return true;
	}
}
