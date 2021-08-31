package _02_array._003_rockPaperScissors;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author dyl1912
 *
 *3. 가위 바위 보
설명

A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.

가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

예를 들어 N=5이면

Image1.jpg

두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.

두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.

세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.


출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.


예시 입력 1 

5
2 3 3 1 3
1 1 2 2 3
예시 출력 1

A
B
A
B
D
 */

public class _003_RockPaperScissors {
	public static void main(String[] args) {
		_003_RockPaperScissors m = new _003_RockPaperScissors();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[2][n];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(char ch : m.solution(n, arr)) {
			System.out.println(ch);
		}
	}
	
	public static ArrayList<Character> solution(int n, int[][] arr) {
		ArrayList<Character> answer = new ArrayList<Character>();
		
		for (int i = 0; i < arr[0].length; i++) {
			int a = arr[0][i], b = arr[1][i];
			
			if(a == b) answer.add('D');
			else if(Math.abs(a - b) == 1) {
				answer.add(a > b ? 'A' : 'B');
			} else if(Math.abs(a - b) == 2) {
				answer.add(a > b ? 'B' : 'A');
			} 
		}
		
		return answer;
	}
}
