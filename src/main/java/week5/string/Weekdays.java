package week5.string;

import java.util.Calendar;
import java.util.Date;

public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calendar c1 = Calendar.getInstance();
		String dayofWeek = "Monday";

		// Date d1=new Date();
		int day = 1;
		/*
		 * c1.setTime(d1); System.out.println(c1.get(Calendar.DAY_OF_WEEK)); if
		 * ((c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (Calendar.DAY_OF_WEEK
		 * == Calendar.SUNDAY)) {
		 * 
		 * day=2;
		 * 
		 * }
		 */

		/*if (dayofWeek.equalsIgnoreCase("Saturday") || dayofWeek.equalsIgnoreCase("Sunday")) {
			day = 2;
		}*/

		switch (dayofWeek) {
		case "Saturday":
			System.out.println("Weekend");
			break;

		case "Sunday":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Weekday");
			break;
		}

	}

}
