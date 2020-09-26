package com.capg.Day5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegUc1 {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String firstname = scan.next();
		String pattern = "^[A-Z][a-z]{2,}";
		Pattern p1 = Pattern.compile(pattern);
		Matcher m1 = p1.matcher(firstname);
		
		while(m1.matches()) {
			System.out.println("Correct first name");
		}
		{
			System.out.println("Wrong first name");
		}
		
		}
		}
