package day1;
import java.util.Scanner;

public class WhatName {
	public static void main(String[] args) {
		System.out.print("이름이 뭡니까?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println();
		System.out.print(name +" 입니다.");
	}
}
