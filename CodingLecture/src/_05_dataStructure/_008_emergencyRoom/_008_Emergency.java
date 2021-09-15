package _05_dataStructure._008_emergencyRoom;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _008_Emergency {
	static class Person {
		int id;
		int priority;
		public Person(int id, int priority) {
			this.id = id;
			this.priority = priority;
		}
	}
	
	public static void main(String[] args) {
		_008_Emergency T = new _008_Emergency();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
	
	public static int solution(int n, int m, int[] arr) {
		int answer = 1;
		
		Queue<Person> q = new LinkedList<Person>();
		for (int i = 0; i < n; i++) {
			q.add(new Person(i, arr[i]));
		}
		
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			boolean tf = true;
			
			for(Person p : q) {
				if(tmp.priority < p.priority) {
					q.add(tmp);
					tf = false;
					break;
				}
			}
			
			if(tf) {
				if(tmp.id == m) break;
				else answer++;
			}
		}
		
		return answer;
	}
}
