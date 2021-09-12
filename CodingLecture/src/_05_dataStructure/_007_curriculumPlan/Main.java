package _05_dataStructure._007_curriculumPlan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine(), s2 = sc.next();
		System.out.println(T.solution(s1, s2));
	}
	
	public static String solution(String s1, String s2) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<Character>();
		
		for(char x : s1.toCharArray()) {
			q.offer(x);
		}
		
		for(char x : s2.toCharArray()) {
			if(q.contains(x)) {
				if(x != q.poll()) return "NO";
			}
		}
		
		if(!q.isEmpty()) return "NO";
		
		return answer;
	}
}
