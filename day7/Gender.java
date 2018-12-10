package day7;
import java.util.Scanner;

public class Gender {
	public void Gendercal() {
		System.out.println("이름과 주민등록 번호를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String ssn = scanner.next();
		char ch = ssn.charAt(7);
		String res = "";
		
		if(ch == 1 || ch == 3) {
			res = "남자";
		}else if(ch == 2 || ch==4 ){
			res = "여자";			
		}else if(ch == 5 || ch == 6){
			res = "외국인";
		}else{
			res = "다시 입력하세요";
		}
		System.out.println(name +":"+ssn +":"+res);
	}
}
