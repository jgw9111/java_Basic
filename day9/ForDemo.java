package day9;
import java.util.Scanner;
public class ForDemo {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int limit = scanner.nextInt();
		String res = "";
		int sum = 0;
		for(int i=0;i<limit;i++) {
			if(i < limit-1) {
				res += i +"+";
			}else {
				res += i;
			}
			sum += i;
		}
		System.out.println(res+"="+sum);
	}
}
