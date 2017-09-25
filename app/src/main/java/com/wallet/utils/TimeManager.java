package com.wallet.utils;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeManager {
	
	public static void main(String args[])
	{
		Calendar cal = GregorianCalendar.getInstance();
		Timestamp t1 = new Timestamp(cal.getTimeInMillis());
		Timestamp t2 = new Timestamp(cal.getTimeInMillis());
		TimeManager tm=new TimeManager();
		System.out.println(tm.compare(t1, t2));
		System.out.println(t1);
		
	}
	
	
	public int compare(Timestamp t1, Timestamp t2) {

	    long l1 = t1.getTime();
	    long l2 = t2.getTime();
	    if (l2 > l1)
	    return 1;
	    else if (l1 > l2)
	    return -1;
	    else
	    return 0;
	    
	}

}
