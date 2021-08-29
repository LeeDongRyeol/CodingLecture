package _004_reverseWord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author dr854
 * 
 * 
 * 4. 단어 뒤집기
설명

N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.

두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.


출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.


예시 입력 1 

3
good
Time
Big
예시 출력 1

doog
emiT
giB
 *
 */

public class _004_ReverseWord {
	public static void main(String[] args) throws IOException {
		_004_ReverseWord m = new _004_ReverseWord();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			String word = br.readLine();
			bw.write(m.solution(word) + "\n");
		}
		bw.flush();
	}
	
	public static String solution(String str) {
		String answer = "";
		
//		for (int i = str.length() - 1; i >= 0; i--) {
//			answer += str.charAt(i);
//		}
		
		for (int i = 0; i < str.length(); i++) {
			answer = str.charAt(i) + answer;
		}
		
		
		return answer;
	}
}
