package day2;
import java.util.Scanner;
public class Howmuch {

	public static void main(String[] args) {
		System.out.println("얼마에요?");
		Scanner scan = new Scanner(System.in);
		String price = scan.next();
		int p = Integer.parseInt(price);
		System.out.println(price+" 원 입니다");

		System.out.println("몇 개 드릴까요?");
		String num = scan.next();
		int a = Integer.parseInt(num);
		System.out.println(num+" 개 주세요");
		int dc = 0;	

		if(p>=1000){
			dc = p*8/10;
		}else if(p>=500){
			dc = p*9/10;
		}else{
			dc = p;
		}
			System.out.println("총 가격은"+dc*a+"입니다");

	}

}
