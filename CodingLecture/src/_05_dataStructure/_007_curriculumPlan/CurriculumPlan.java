package _05_dataStructure._007_curriculumPlan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumPlan {
	public static void main(String[] args) {
		CurriculumPlan T = new CurriculumPlan();
		Scanner sc = new Scanner(System.in);
		String need = sc.nextLine();
		String plan = sc.next();
		System.out.println(T.solution(need, plan));
	}
	
	public static String solution(String need, String plan) {
		String answer = "YES";
		
		Queue<Character> q = new LinkedList<Character>();
		for(char ch : need.toCharArray()) q.add(ch);
		
		for(char ch : plan.toCharArray()) {
			if(q.contains(ch)) {
				if(q.poll() != ch) return "NO";
			}
		}
		
		if(!q.isEmpty()) return "NO";
		
		return answer;
	}
}
