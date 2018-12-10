package day3;
import java.util.Scanner;
public class Bmi {

	public static void main(String[] args) {
		System.out.println("몸무게: ");
		Scanner scan = new Scanner(System.in);
		String wei = scan.next();
		double w = Double.parseDouble(wei);

		System.out.println("키 : ");
		String hei = scan.next();
		double h = Double.parseDouble(hei);	
		
		double bmi = 0.0; 
		bmi = w*10000/(h*h);
		
		System.out.println("BMI:" + bmi);

		String result = "";
			
		if(bmi>=40){
			result = "고도비만"; 		
		}else if(bmi>=35){
			result = "중등도비만";
		}else if(bmi>=30){
			result = "경도비만";
		}else if(bmi>=25){
			result = "과체중";
		}else if(bmi>=18.5){
			result = "정상";
		}else{
			result = "저체중";
		}
			System.out.println(result);
	}

}
