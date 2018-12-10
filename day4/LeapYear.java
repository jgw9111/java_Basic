package day4;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
        System.out.println("연도를 입력하세요");
        Scanner scan = new Scanner(System.in);
        String Year = scan.next();
        int Leap = Integer.parseInt(Year);

        String result = "";
        if((Leap%4==0 && Leap%100!=0)|| Leap%400==0){        //4�� ���� �������� 0 �̸鼭, 100�� ����� ����(!=) + 400�� ����� �ش� ����

                result="윤년";}
         
        else{
            result="평년";
            }
        

        System.out.println(Year+"년은:"+ result );
	}

}
