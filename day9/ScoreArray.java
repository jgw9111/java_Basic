package day9;
import java.util.Scanner;
public class ScoreArray {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3명의 점수를 입력하세요");
		int[] score = new int[3];
		for(int i=0;i<score.length;i++) {
			score[i] = scanner.nextInt();
		}

		String res = "";
		
		for(int i=0;i<score.length;i++) {
			if(i<score.length-1) {
				res += score[i]+",";
			}else {
				res += score[i];
			}
		}
		System.out.println(res);
	}

}