package com.capg.Day5;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class userRegUc6 {

		public boolean firstNameValidate(String fName) {
			Pattern pattern = Pattern.compile("^([A-Z])\\w{2,}$");
			Matcher matcher = pattern.matcher(fName);
			return matcher.find();
		}

		public boolean lastNameValidate(String lName) {
			Pattern pattern = Pattern.compile("^([A-Z])\\w{2,}$");
			Matcher matcher = pattern.matcher(lName);
			return matcher.find();
		}

		public boolean emailValidate(String email) {
			Pattern pattern = Pattern.compile("^([a-z][0-9a-z_-]*)(.[a-z][0-9a-z_-]*)?@bl.co(.in)?$");
			Matcher matcher = pattern.matcher(email);
			return matcher.find();
		}

		public boolean mobileValidate(String mobile) {
			Pattern pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
			Matcher matcher = pattern.matcher(mobile);
			return matcher.find();
		}
		
		public boolean passwordValidate(String password) {
			Pattern pattern = Pattern.compile("^(?=.*[A-Z])+.{8,}$");
			Matcher matcher = pattern.matcher(password);
			return matcher.find();
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			userRegUc6 userReg = new userRegUc6();

			System.out.println("Enter password: ");
			if (userReg.passwordValidate(sc.next()))
				System.out.println("correct password.");
			else
				System.out.println("correct password.");
		}
	}