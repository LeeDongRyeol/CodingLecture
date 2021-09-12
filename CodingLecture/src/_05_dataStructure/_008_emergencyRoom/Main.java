package _05_dataStructure._008_emergencyRoom;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static class Person {
		int id;
		int priority;
		public Person(int id, int priority) {
			this.id = id;
			this.priority = priority;
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
		
		System.out.println(T.solution(n, m, arr));
	}
	
	public static int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Queue<Person> q = new LinkedList<Person>();
		for (int i = 0; i < n; i++) {
			q.add(new Person(i, arr[i]));
		}
		
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			
			for(Person x : q) {
				if(x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			
			if(tmp != null) {
				answer++;
				if(tmp.id == m) return answer;
			}
			
		}
		
		return answer;
	}
}
