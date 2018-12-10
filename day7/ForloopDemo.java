package day7;
import java.util.Scanner;

public class ForloopDemo {

	public static void main(String[] args) {
		
		String res ="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하세요");
		int limit = scanner.nextInt();
		int sum = 0;
				
		for(int i=1;i<=limit;i++) //for 안에서만 i , 밖에 선언하면 전체에서 사용하게 됨 
			{
		
			if(i != limit) { // 더 많이 찾는 걸 if에
				res += i + "+";
			}else {
				res += i + "=";
			}
			sum += i;
			}
		
		System.out.println(res+sum);
	}

}
