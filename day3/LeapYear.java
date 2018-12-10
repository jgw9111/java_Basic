package day3;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("년도를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String year = scan.next();
		int y = Integer.parseInt(year);
		
		int ly1 = 0;
		ly1 = y%4; 
		int ly2 = 0;
		ly2 = y%100; 
		int ly3 = 0;
		ly3 = y%400; 



		String result = ""; 

		if(ly1==0){
			if(ly2==0){	
				if(ly3==0){
					result = "윤년";
				}else{
					result = "평년";
				}
				
			}else{
				result ="윤년";	
			}
			
		}else{
			result = "평년";
		}

		System.out.println(year+"년"+":"+result);
	}

}
