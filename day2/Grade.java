package day2;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		System.out.println("이름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		System.out.println("국어, 영어, 수학, 사회, 과학 점수를 입력하세요");
		String kor = scan.next();
		String eng = scan.next();
		String mat = scan.next();
		String soc = scan.next();
		String sic = scan.next();
		String score;

		int a = Integer.parseInt(kor);
		int b = Integer.parseInt(eng);
		int c = Integer.parseInt(mat);
		int d = Integer.parseInt(soc);
		int e = Integer.parseInt(sic);
		int add = a+b+c+d+e;


		if(add/5 >= 90){
			score = "A";
		}else if(add/5 >= 80){
			score = "B";
		}else if(add/5 >= 70){
			score = "C";
		}else if(add/5 >= 60){
			score = "D";
		}else if(add/5 >= 50){
			score = "E";
		}else{
			score = "F";
		}
		
		System.out.println(name + "총점" + add + "평균" + add/5 + "성적" + score + "학점");


	}

}
