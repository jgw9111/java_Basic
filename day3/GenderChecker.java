package day3;
import java.util.Scanner;
public class GenderChecker {

	public static void main(String[] args) {
		System.out.println("이름과 주민등록번호를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String ssn = scan.next();
		char ch = ssn.charAt(7);

		String gender = "";

		if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
			gender = "다시 입력하세요.";
		}else if(ch=='1'||ch=='3'){
			gender = "남자";
		}else if(ch=='2'||ch=='4'){
			gender = "여자";
		}else {
			gender = "외국인";
		}

			System.out.println(name+":"+ ssn + ":" + gender);	
	}

}
