	/*
	 * Written by Jaydee Maldonado
	 */

import java.util.Scanner;
public class CSCE145Zodiac {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		// Creates the start up message
		System.out.println("What is your Zodiac?\nMonth followed by Day as numbers.");
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		//This the invalid rule for month
		if (month < 1 || month > 12) {
            System.out.println("Invalid Month!");
        } else if (!isValidDay(month, day)) {

        	System.out.println("Invalid Day!");
        } else {

        	String zodiacSign = getZodiacSign(month, day);
            System.out.println("You are a " + zodiacSign + "!");
        }
	}
		//the rule for the specific months with only 30 or 31 days
		 public static boolean isValidDay(int month, int day) {
		        if (day < 1) {
		            return false;
		        }
		       
		        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
		            return day <= 31;
		        }
		       
		        else if (month == 4 || month == 6 || month == 9 || month == 11) {
		            return day <= 30;
		        }
		        //This is for February since there only 29 days
		        else {
		            return day <= 29;
		        }
		    }
		// Determines the zodiac based on day and month
		 public static String getZodiacSign(int month, int day) {
		        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
		            return "Aries";
		        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
		            return "Taurus";
		        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
		            return "Gemini";
		        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
		            return "Cancer";
		        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
		            return "Leo";
		        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
		            return "Virgo";
		        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
		            return "Libra";
		        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
		            return "Scorpio";
		        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
		            return "Sagittarius";
		        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
		            return "Capricorn";
		        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
		            return "Aquarius";
		        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
		            return "Pisces";
		        } else {
		            return "Unknown"; 
		        }
		    }
		}
		
		
					



