package userAccount;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import daoImpl.*;

public class ScheduleFlightServicesImpl implements ScheduledFlightDaoImpl {
	public static ArrayList<Schedule> al=new ArrayList<Schedule>();

	public void viewScheduleFlights(Airport s, Airport d, Date date)
	{
		Iterator<Schedule> it=al.iterator();
		while(it.hasNext())
		{
			Schedule s1=(Schedule)it.next();
			

		if(s.getAirportLocation().equals(s1.getSourceAirport().getAirportLocation()))
		{
			if(d.getAirportLocation().equals(s1.getDestinationAirport().getAirportLocation()))
					{
						System.out.println();
						System.out.println("\t\t Scheduled Flights");
						System.out.println("\t\t ~~~~~~~~~~~~~~~~~");
						System.out.println("--------------------------------------------------------");
						System.out.println("\tAirport Name: :"+s1.getSourceAirport().getAirportName());
						System.out.println("\tAirport Location: :"+s1.getSourceAirport().getAirportLocation());
						System.out.println("\tDeparture Time: :"+s1.getDepartureTime());
						System.out.println("\tArrival Time: :"+s1.getArrivalTime());
						System.out.println("--------------------------------------------------------");
						break;
					}
		}
		}
		
		
	}
	
	public void showBookings()
	{
		Iterator<Booking> it1=(BookingServicesImpl.al).iterator();
		System.out.println("***********************************************************");
		System.out.println("\t\t  Current Bookings:");
		System.out.println("***********************************************************");
		while(it1.hasNext())
		{
			Booking b=(Booking)it1.next();
			System.out.println();
			System.out.println("\tBooking Date: "+b.getBookingDate());
			System.out.println("\tBookingId: "+b.getBookingId());
			System.out.println("\tUserId: "+b.getUserId());
			System.out.println("\tPassengers: "+b.getNoOfPassengers());
			System.out.println("\tTotal Cost :"+b.getTicketCost());
			
			System.out.println("--------------------------------------------------------");
			
		}

	}
	
	public void deleteScheduleFlight(BigInteger bookingId)
	{
		
		Iterator<Booking> it=(BookingServicesImpl.al).iterator();
		Booking b=null;
		while(it.hasNext())
		{
			 b=it.next();
			if(bookingId.equals(b.getBookingId()))
			{
				
				break;
			}
		}
		BookingServicesImpl.al.remove((BookingServicesImpl.al).indexOf(b));
		
		
	}

}
