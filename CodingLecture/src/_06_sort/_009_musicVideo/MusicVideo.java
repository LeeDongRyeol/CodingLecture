package _06_sort._009_musicVideo;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {
	public static void main(String[] args) {
		MusicVideo T = new MusicVideo();
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
	
	public static int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		int lt = Arrays.stream(arr).max().getAsInt();	// reduction data
		int rt = Arrays.stream(arr).sum();
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid -1;
			} else lt = mid + 1;
		}
		
		
		return answer;
		
	}
	
	public static int count(int[] arr, int capacity) {
		int cnt = 1, sum = 0;
		
		for(int x : arr) {
			// 현재 사용되는 DVD에 몇분이나 저장되는것인가
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			} else sum += x;
		}
		
		return cnt;
	}
}
