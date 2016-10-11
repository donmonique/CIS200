/**
 * Gets a time from user and delays the time
 * @author Donmonique Edmondson
 * @version 1
 */
import java.util.*;
import java.text.*;
public class TimeDelay {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00");
		String hlabel = " hours, ";
		String mlabel = " minutes, and ";
		String slabel = " seconds.";
		System.out.print("Enter the current hour value (1-12) : ");
		int hour = Integer.parseInt(s.nextLine());
		System.out.print("Enter the current minute value (0-59) : ");
		int minute = Integer.parseInt(s.nextLine());
		System.out.print("Enter the current seconds value (0-59) : ");
		int seconds = Integer.parseInt(s.nextLine());
		
		System.out.print("Enter the number of hours to delay : ");
		int hourdelay = Integer.parseInt(s.nextLine());
		System.out.print("Enter the number of minutes to delay : ");
		int minutedelay = Integer.parseInt(s.nextLine());
		System.out.print("Enter the number of seconds to delay : ");
		int secdelay = Integer.parseInt(s.nextLine());
		if (secdelay == 1) {
			slabel = " second.";
		}
		if (minutedelay == 1) {
			mlabel = " minute, and ";
		}
		if (hourdelay == 1) {
			hlabel = " hour, ";
		}
		
		System.out.println("It is currently " + hour + ":" + minute + ":" + seconds + ".");
		System.out.println("A delay of "+hourdelay+hlabel+minutedelay+mlabel+secdelay+slabel);
		seconds += secdelay;
		if (seconds > 60) {
			minutedelay += seconds/60;
			seconds  = seconds%60;
		}
		minute += minutedelay;
		if (minute > 60) {
			hourdelay += minute/60;
			minute = minute%60;
		}
		hour += hourdelay;
		if (hour > 12) { 
			hour = hour % 12;
		}
		System.out.println("will make the time " + df.format(hour) + ":" + df.format(minute) + ":" + df.format(seconds) + ".");
	}

}
