package corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarFormats {

	public static void main(String[] args) {
		/*
		 * Date Formats
		 * y: Year
		 * M: Month in year
		 * d: Day in month
		 * H: Hour in day (0-23)
		 * h: Hour in am/pm (1-12)
		 * m: Minute in hour
		 * s: Second in minute
		 * S: Millisecond
		 * 
		 * "yyyy-MM-dd": e.g., 2023-11-25
		 * "dd/MM/yyyy": e.g., 25/11/2023
		 * "yyyy-MM-dd HH:mm:ss": e.g., 2023-11-25 15:30:45
		 * "EEE, d MMM yyyy HH:mm:ss Z": e.g., Fri, 25 Nov 2023 15:30:45 +0530
		 */
		System.out.println("\n****** Date+SimpleDateFormat Class ******\n");
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat pattern = new SimpleDateFormat("dd/MM/YY hh:mm:ss");
		System.out.println(pattern.format(date));
		
		// Used to get constants from the defined date format
		System.out.println("\n****** Calendar+SimpleDateFormat Class ******\n");
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		SimpleDateFormat p = new SimpleDateFormat("dd/MM/YY H");
		System.out.println(p.format(cal.getTime()));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

	}

}
