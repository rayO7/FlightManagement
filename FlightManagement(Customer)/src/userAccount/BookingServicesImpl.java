package userAccount;

import java.math.BigInteger;
import daoImpl.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;

public class BookingServicesImpl implements BookingDaoImpl{
	public static ArrayList<Booking> al=new ArrayList<Booking>();
	
	public void addBooking(Booking b) throws ParseException
	{
		Scanner sc=new Scanner(System.in);
		
		Random random=new Random();
	    BigInteger BookingId=BigInteger.valueOf(Math.round(random.nextFloat()*Math.pow(10,12)));
		
	    System.out.println("Enter userId:");
	    BigInteger userId=sc.nextBigInteger();
	    sc.nextLine();
	    
	    System.out.println("Enter Booking Date: ");
	    String date=sc.nextLine();  
	    
	    System.out.println("Enter no of Passengers: ");
	    int noOfPassengers=sc.nextInt();
	    
	    b.setUserId(userId);
	    b.setNoOfPassengers(noOfPassengers);
	    b.setBookingId(BookingId);
	    b.setBookingDate(date);
	    
	    al.add(b);
	    sc.close();
	    
	    System.out.println("Note your BOOKINGID: "+BookingId);
	    
	    System.out.println("---------------------------------------------");
	    System.out.println("Booking done");
	    System.out.println();
	    System.out.println();
	    System.out.println("Your Booking");
	    System.out.println("---------------------------------------------");
	    viewBooking(BookingId);

	    
	    
	}
	
	public void viewBooking(BigInteger bookingId)
	{
		Iterator<Booking> it=al.iterator();
		while(it.hasNext())
		{
			Booking b=(Booking)it.next();
			if(b.getBookingId()==bookingId)
			{
				System.out.println("UserId :"+b.getUserId());
				System.out.println("BookingId :"+b.getBookingId());
				System.out.println("Booking Date :"+b.getBookingDate());
				System.out.println("No Of Passenger :"+b.getNoOfPassengers());
				break;
			}
		}
	}

}
