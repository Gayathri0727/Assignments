package com.cg.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String sb=new String();
		
		System.out.println("Enter the name you want to reverse");
		sb=sc.next();
		String sb1=sb.replaceAll("[^a-zA-Z]", "").toLowerCase();
		StringBuffer s=new StringBuffer(sb1);
		StringBuffer rev=s.reverse();
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("no");
		}
		sc.close();
		
		
		
	}

}
