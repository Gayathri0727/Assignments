package com.cg.day1;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String spaces[]=s.split(" ");
		int len=spaces.length;
		System.out.println("No.of spaces are "+(len-1));
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==',') {
				count++;
			}
		}
		System.out.println("No. of words are "+(len-count));
		System.out.println("No.of commas are "+count);
		sc.close();
		
		
	}

}
