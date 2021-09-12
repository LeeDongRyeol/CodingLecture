package _05_dataStructure._007_curriculumPlan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _007_CurriculumPlan {
	public static void main(String[] args) {
		_007_CurriculumPlan T = new _007_CurriculumPlan();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine(), s2 = sc.next();
		System.out.println(T.solution(s1, s2));
	}
	
	public static String solution(String s1, String s2) {
		String answer = "YES";
		
		Queue<Character> q = new LinkedList<Character>();
		for(char ch : s1.toCharArray()) q.add(ch);
		
		for(char ch : s2.toCharArray()) {
			if(q.contains(ch)) {
				if(q.peek() != ch) return "NO";
				else q.poll();
			}
		}
		
		if(!q.isEmpty()) answer = "NO";
		
		return answer;
	}
}
