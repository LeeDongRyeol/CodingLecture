package _001_findCharactor;

import java.util.Scanner;

public class _001_FindCharactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toLowerCase();
		String ch = sc.next().toLowerCase();
		
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if(ch.equals(str.substring(i, i+1))) cnt++;
		}
		
		System.out.println(cnt);
	}
}
