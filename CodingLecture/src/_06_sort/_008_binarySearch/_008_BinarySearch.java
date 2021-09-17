package _06_sort._008_binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class _008_BinarySearch {
	public static void main(String[] args) {
		_008_BinarySearch T = new _008_BinarySearch();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
	
	public static int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		
		int lt = 0, rt = n-1;
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			
			if(arr[mid] == m) {
				answer = mid + 1;
				break;
			} else if(arr[mid] > m) rt = mid - 1;
			else lt = mid + 1;
		}
		
		return answer;
	}
}
