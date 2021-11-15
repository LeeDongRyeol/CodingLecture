package _08_dfsBfs._006_permutation;

import java.util.Scanner;

public class _006_Permutation {
	static boolean[] check;
	static int n, m;
	static int[] numArr;
	
	public static void dfs(int j, int[] arr) {
		if(j == m) {
			for (int num : numArr) {
				System.out.print(num + " ");
			}
			System.out.println();
		} else {
			for (int i = 0; i < n; i++) {
				if(!check[i]) {
					check[i] = true;
					numArr[j] = arr[i];
					dfs(j+1, arr);
					check[i] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		
		int[] arr = new int[n];
		check = new boolean[n];
		numArr = new int[m];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dfs(0, arr);
		sc.close();
	}
}
