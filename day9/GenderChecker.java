package day9;
import java.util.Scanner;
public class GenderChecker {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 주민등록번호를 입력하세요");
		String name = scanner.next();
		String ssn = scanner.next();
		char ch = ssn.charAt(7);
		String gen = "";
		
		if(ch == '1' || ch == '3') {
			gen = "남자";
		}else if(ch == '2' || ch == '4'){
			gen = "여자";
		}else if(ch == '5' || ch == '6'){
			gen = "외국인";
		}else{
			gen = "다시 입력하세요";
		}
		System.out.println(name + " : " + ssn +" : "+gen);
	}
	public static void main(String[] args) {
		GenderChecker gen = new GenderChecker();
		gen.test();
	}
}
