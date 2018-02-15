/**
 * 
 */
import java.time.LocalDate;
import java.UtilTest2.Calendar;
import java.UtilTest2.Date;
//import java.time;
/**
 * @author User
 *
 */
public class UtilTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Date dt = new Date();
	String currentDate = String.valueOf(dt.getDay());
	System.out.println("Current Date is : " + currentDate);
	System.out.println(" Current Time is : " + dt.getTime());
	
	System.out.println("Current Date is :" + currentCalDate);
	
/*
	//cal.set(year, month, date, hoursOFDay, minute,second)
	int year = Interger.parselInt(args[0]);
	int month = Interger.parselInt(args[1]);
	int date = Interger.parselInt(args[2]);	
	int hoursOfDay = Interger.parselInt(args[3]);
	int minute = Interger.parselInt(args[4]);
	int second = Interger.parselInt(args[5]);
	
	cal.set(year,(month-1),date, hoursOfDay, minute, second);
	System.out.println("Four date is :" + yourDate);
*/
	
		String yourDate = cal.get(Calendar.DATE) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar. )
		
		LocalDateTime localDate = LocalDate.now();
		System.out.println("Current Date before : " + localDate);
		
		
	}

}
