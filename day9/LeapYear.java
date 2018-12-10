package day9;
import java.util.Scanner;
public class LeapYear {
	public void leapyear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int leapyear = scanner.nextInt();
		String ly = "";
		
		if(leapyear%4==0 && leapyear%100 != 0 || leapyear%400 ==0 ) {
			ly = "윤년";
		}else {
			ly = "평년";
		}
		System.out.println(leapyear+"년은"+ly);
	}
}
