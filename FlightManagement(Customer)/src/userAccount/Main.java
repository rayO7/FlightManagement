package userAccount;

import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import DataInfo.*;

public class Main {
	
	public static void main(String[] args) throws ParseException, NumberFormatException, IOException {
		

		
		
		System.out.println();
		System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t+   !!.....Welcome to FLIGHT MANAGEMNET SYSTEM.....!!   +");
		System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
		System.out.println();
		System.out.println("Enter your choice:");
		System.out.println("[1.signup]/[2.login]");
		System.out.println("....................");
		int s=sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.println();
		System.out.println();
		
		if(s==1)
		{
			UserService u=new UserService();
			User u1=new User();
			u.addUser(u1);
			
				
		}
		else
		{
			new UserInfo().put();
			new ValidateUser().entry();
			
			new ValidateUser();
			if(ValidateUser.check)
			{
				while(true)
				{
					
				System.out.println("\t\t\t WELCOME USER!!!");
				System.out.println("\t\t\t~~~~~~~~~~~~~~~~");
				System.out.println();
				
				System.out.println("\t--------------------------------------------------------");
				System.out.println("\t|                                                      |");
				System.out.println("\t|\t 1.Book A Flight                               |");
				System.out.println("\t|                                                      |");
				
				System.out.println("\t|\t 2.View Available Flights    		       |");
				System.out.println("\t|                                                      |");
				
				System.out.println("\t|\t 3.Cancel A Booking                            |");
				System.out.println("\t|                                                      |");
				System.out.println("\t--------------------------------------------------------");
				
				System.out.println();
				System.out.println("Enter your Choice :");
				int ch=sc.nextInt();
				sc.nextLine();
				
				switch(ch)
				{
				case 1:
					Booking b=new Booking();
					BookingServicesImpl book=new BookingServicesImpl();
					book.addBooking(b);
					
					break;
					
				case 2:	
					new ScheduleInfo().ScheduleDetails();
					
					Airport a1=new Airport();
					Airport a2=new Airport();
					
					System.out.println("Enter source:");
					String source=sc.nextLine();
					a1.setAirportLocation(source);
					
					System.out.println("Enter destination: ");
					String destination=sc.nextLine();
					a2.setAirportLocation(destination);
					
					ScheduleFlightServicesImpl flight1=new ScheduleFlightServicesImpl();
					Date date=new Date();
					flight1.viewScheduleFlights(a1, a2, date);
					
					
					break;
					
				case 3:
					new BookedInfo().booked();
					
					ScheduleFlightServicesImpl flight=new ScheduleFlightServicesImpl();
					flight.showBookings();
					System.out.println("Enter bookingId: ");
					BigInteger bookingId=sc.nextBigInteger();
					
					flight.deleteScheduleFlight(bookingId);
					System.out.println();
					System.out.println("\t\t------CANCELLATION DONE------");
					flight.showBookings();
					
					break;
					
				default:
					System.out.println("Enter valid choice");
					
					
				}
				System.out.println();
				System.out.println("Press 1 to continue:");
				int n=sc.nextInt();
				if(n!=1)
					System.exit(1);
			}
			}
			
			
			else 
			{
				System.out.println("Wrong user::!!!!!");
			
			}
			
		
		
		
		
		
	}	
		}
}
}