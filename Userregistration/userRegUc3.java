package com.capg.Day5;

	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class userRegUc3 {

		public boolean firstName(String fName) {
			Pattern pattern = Pattern.compile("^([A-Z])\\w{2,}$");
			Matcher matcher = pattern.matcher(fName);
			return matcher.find();
		}

		public boolean lastName(String lName) {
			Pattern pattern = Pattern.compile("^([A-Z])\\w{2,}$");
			Matcher matcher = pattern.matcher(lName);
			return matcher.find();
		}

		public boolean emailValidate(String email) {
			Pattern pattern = Pattern
					.compile("^([a-z][0-9a-z_-]*)(.[a-z][0-9a-z_-]*)?@bl.co(.in)?$");
			Matcher matcher = pattern.matcher(email);
			return matcher.find();
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			userRegUc3 userReg = new userRegUc3();
			
			System.out.println("Enter your email: ");
			if (userReg.emailValidate(sc.next()))
				System.out.println("correct email.");
			else
				System.out.println("Incorrect email.");
		}
	}
