package testCases;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class NoGui {

public static void main(String[] args) throws MalformedURLException {
	
	
//	String sActValue = "Wed May 08 18:00:00 IST 2024";
//	String sExpValue = "18:00:00";
//	boolean bValue = sActValue.contains(sExpValue);
//	System.out.println(bValue);
	
	String s1 ="tskNT_ExecuteTask_DTAfterDaysasdfasdf";
	String s2="tskNT_ExecuteTask_DTBeforeMinuasdfasdf";
	System.out.println("s1 length:" + StringUtils.left(s1,29));
	System.out.println("s1 length:" + StringUtils.left(s2,29));
	  Date d1 = new Date(); 
	  // Printing the value stored in above object 
      System.out.println("Current date is " + d1);
      
      Date currentDate = new Date();
      System.out.println("current get date: " + currentDate.getDate());
      System.out.println("current get day: " + currentDate.getDay());
      
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
      String currentDateTime = dateFormat.format(currentDate);
      System.out.println("Current date is " + currentDateTime);
 
      
      
}
}
